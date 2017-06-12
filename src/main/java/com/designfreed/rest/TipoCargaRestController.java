package com.designfreed.rest;

import com.designfreed.crm.domain.TipoCarga;
import com.designfreed.services.TipoCargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("tipoCarga")
public class TipoCargaRestController {
    private TipoCargaService tipoCargaService;

    @Autowired
    public void setTipoCargaService(TipoCargaService tipoCargaService) {
        this.tipoCargaService = tipoCargaService;
    }

    @GetMapping("/list")
    public List<TipoCarga> findAll() {
        return tipoCargaService.findAll();
    }
}
