package com.designfreed.rest;

import com.designfreed.crm.domain.EstadoMovimiento;
import com.designfreed.services.EstadoMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/estadoMovimiento")
public class EstadoMovimientoRestController {
    private EstadoMovimientoService estadoMovimientoService;

    @Autowired
    public void setEstadoMovimientoService(EstadoMovimientoService estadoMovimientoService) {
        this.estadoMovimientoService = estadoMovimientoService;
    }

    @GetMapping("/list")
    public List<EstadoMovimiento> findAll() {
        return estadoMovimientoService.findAll();
    }
}
