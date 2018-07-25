package com.designfreed.rest;

import com.designfreed.crm.domain.Camion;
import com.designfreed.services.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/camion")
public class CamionRestController {
    private CamionService camionService;

    @Autowired
    public void setCamionService(CamionService camionService) {
        this.camionService= camionService;
    }

    @GetMapping("/list")
    public List<Camion> findAll() {
        return camionService.findAll();
    }
}
