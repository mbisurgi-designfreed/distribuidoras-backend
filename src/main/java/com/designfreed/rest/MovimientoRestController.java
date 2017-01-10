package com.designfreed.rest;

import com.designfreed.domain.HojaRuta;
import com.designfreed.domain.Movimiento;
import com.designfreed.services.HojaRutaService;
import com.designfreed.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movimiento")
public class MovimientoRestController {
    private MovimientoService movimientoService;
    private HojaRutaService hojaRutaService;

    @Autowired
    public void setMovimientoService(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
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
}
