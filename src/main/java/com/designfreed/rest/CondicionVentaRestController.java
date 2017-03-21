package com.designfreed.rest;

import com.designfreed.domain.CondicionVenta;
import com.designfreed.services.CondicionVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/condicionVenta")
public class CondicionVentaRestController {
    private CondicionVentaService condicionVentaService;

    @Autowired
    public void setCondicionVentaService(CondicionVentaService condicionVentaService) {
        this.condicionVentaService = condicionVentaService;
    }

    @GetMapping("/list")
    public List<CondicionVenta> findAll() {
        return condicionVentaService.findAll();
    }
}
