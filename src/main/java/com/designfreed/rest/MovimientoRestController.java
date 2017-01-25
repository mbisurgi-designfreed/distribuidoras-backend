package com.designfreed.rest;

import com.designfreed.domain.EstadoMovimiento;
import com.designfreed.domain.HojaRuta;
import com.designfreed.domain.Movimiento;
import com.designfreed.services.EstadoMovimientoService;
import com.designfreed.services.HojaRutaService;
import com.designfreed.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movimiento")
public class MovimientoRestController {
    private MovimientoService movimientoService;
    private EstadoMovimientoService estadoMovimientoService;
    private HojaRutaService hojaRutaService;

    @Autowired
    public void setMovimientoService(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

    @Autowired
    public void setEstadoMovimientoService(EstadoMovimientoService estadoMovimientoService) {
        this.estadoMovimientoService = estadoMovimientoService;
    }

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @GetMapping("/findByHojaRuta/{id}")
    public List<Movimiento> findByHojaRuta(@PathVariable(name = "id") Long id) {
        HojaRuta hojaRuta = hojaRutaService.findById(id);

        return movimientoService.findByHojaRuta(hojaRuta);
    }

    @GetMapping("/findByHojaRutaEstado/{id}/{estado}")
    public List<Movimiento> findByHojaRutaEstado(@PathVariable(name = "id") Long id, @PathVariable(name = "estado") Long estadId) {
        HojaRuta hojaRuta = hojaRutaService.findById(id);
        EstadoMovimiento estadoMovimiento = estadoMovimientoService.findById(estadId);

        return movimientoService.findByHojaRutaEstado(hojaRuta, estadoMovimiento);
    }

    @PostMapping("/add")
    public ResponseEntity<List<Movimiento>> add(@RequestBody List<Movimiento> movimientos) {
        List<Movimiento> savedMovimientos = (List<Movimiento>) movimientoService.saveOrUpdateAll(movimientos);

        ResponseEntity<List<Movimiento>> response;

        if (savedMovimientos != null) {
            response = ResponseEntity.ok(savedMovimientos);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }
}
