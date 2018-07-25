package com.designfreed.rest;

import com.designfreed.crm.domain.Chofer;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.services.ChoferService;
import com.designfreed.services.HojaRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/hojaRuta")
@CrossOrigin
public class HojaRutaRestController {
    private HojaRutaService hojaRutaService;
    private ChoferService choferService;

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @Autowired
    public void setChoferService(ChoferService choferService) {
        this.choferService = choferService;
    }

    @GetMapping("/findByFechaChofer/{fecha}/{id}")
    public HojaRuta findByFechaAndChofer(@PathVariable(name = "fecha") Long fecha, @PathVariable(name = "id") Long id) {
        Chofer chofer = choferService.findById(id);

        return hojaRutaService.findByFechaAndChofer(new Date(fecha), chofer);
    }

    @GetMapping("/findByFecha/{fecha}")
    public List<HojaRuta> findByFecha(@PathVariable(name = "fecha") Long fecha) {
        return hojaRutaService.findByFecha(new Date(fecha));
    }

    @PostMapping("/add")
    public ResponseEntity<HojaRuta> add(@RequestBody HojaRuta hoja) {
        HojaRuta savedHojaRuta = hojaRutaService.saveOrUpdate(hoja);

        ResponseEntity<HojaRuta> response;

        if (savedHojaRuta != null) {
            response = ResponseEntity.ok(savedHojaRuta);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }

    @PostMapping("/update")
    public ResponseEntity<HojaRuta> update(@RequestBody HojaRuta hoja) {
        HojaRuta savedHojaRuta = hojaRutaService.saveOrUpdate(hoja);

        ResponseEntity<HojaRuta> response;

        if (savedHojaRuta != null) {
            response = ResponseEntity.ok(savedHojaRuta);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }
}
