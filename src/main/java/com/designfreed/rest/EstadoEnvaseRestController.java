package com.designfreed.rest;

import com.designfreed.domain.EstadoEnvase;
import com.designfreed.services.EstadoEnvaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadoEnvase")
public class EstadoEnvaseRestController {
    private EstadoEnvaseService estadoEnvaseService;

    @Autowired
    public void setEstadoEnvaseService(EstadoEnvaseService estadoEnvaseService) {
        this.estadoEnvaseService = estadoEnvaseService;
    }

    @GetMapping("/list")
    public List<EstadoEnvase> findAll() {
        return estadoEnvaseService.findAll();
    }
}
