package com.designfreed.rest;

import com.designfreed.domain.Carga;
import com.designfreed.domain.HojaRuta;
import com.designfreed.services.CargaService;
import com.designfreed.services.HojaRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
