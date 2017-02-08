package com.designfreed.rest;

import com.designfreed.domain.Motivo;
import com.designfreed.services.MotivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/motivo")
public class MotivoRestController {
    private MotivoService motivoService;

    @Autowired
    public void setMotivoService(MotivoService motivoService) {
        this.motivoService = motivoService;
    }

    @GetMapping("/list")
    public List<Motivo> findAll() {
        return motivoService.findAll();
    }
}
