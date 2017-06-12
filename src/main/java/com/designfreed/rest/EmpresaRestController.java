package com.designfreed.rest;

import com.designfreed.consolidado.domain.Empresa;
import com.designfreed.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/empresa")
public class EmpresaRestController {
    private EmpresaService empresaService;

    @Autowired
    public void setEmpresaService(EmpresaService empresaService) {
        this.empresaService = empresaService;
    }

    @GetMapping("/list")
    public List<Empresa> findAll() {
        return empresaService.findAll();
    }
}
