package com.designfreed.rest;

import com.designfreed.crm.domain.Carga;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.services.CargaService;
import com.designfreed.services.HojaRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/carga")
public class CargaRestController {
    private CargaService cargaService;
    private HojaRutaService hojaRutaService;

    @Autowired
    public void setCargaService(CargaService cargaService) {
        this.cargaService = cargaService;
    }

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @GetMapping("/findByHojaRuta/{id}")
    public List<Carga> findByHojaRuta(@PathVariable(name = "id") Long id) {
        HojaRuta hojaRuta = hojaRutaService.findById(id);

        return cargaService.findByHojaRuta(hojaRuta);
    }

    @PostMapping("/add")
    public ResponseEntity<Carga> saveOrUpdate(@RequestBody Carga carga) {
        Carga savedCarga = cargaService.saveOrUpdate(carga);

        ResponseEntity<Carga> response;

        if (savedCarga != null) {
            response = ResponseEntity.ok(savedCarga);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }
}
