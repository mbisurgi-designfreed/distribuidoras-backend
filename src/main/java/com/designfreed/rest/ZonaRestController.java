package com.designfreed.rest;

import com.designfreed.crm.domain.Zona;
import com.designfreed.services.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/zona")
public class ZonaRestController {
    private ZonaService zonaService;

    @Autowired
    public void setZonaService(ZonaService zonaService) {
        this.zonaService = zonaService;
    }


    @GetMapping("/list")
    public List<Zona> findAll() {
        return zonaService.findAll();
    }
}
