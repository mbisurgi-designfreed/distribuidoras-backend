package com.designfreed.rest;

import com.designfreed.crm.domain.Talonario;
import com.designfreed.services.TalonarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/talonario")
public class TalonarioRestController {
    private TalonarioService talonarioService;

    @Autowired
    public void setTalonarioService(TalonarioService talonarioService) {
        this.talonarioService = talonarioService;
    }

    @GetMapping("/list")
    public List<Talonario> findAll() {
        return talonarioService.findAll();
    }
}
