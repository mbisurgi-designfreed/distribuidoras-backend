package com.designfreed.rest;

import com.designfreed.domain.Envase;
import com.designfreed.services.EnvaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/envase")
public class EnvaseRestController {
    private EnvaseService envaseService;

    @Autowired
    public void setEnvaseService(EnvaseService envaseService) {
        this.envaseService = envaseService;
    }

    @GetMapping("/list")
    public List<Envase> findAll() {
        return envaseService.findAll();
    }
}
