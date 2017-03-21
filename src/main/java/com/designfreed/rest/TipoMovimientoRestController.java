package com.designfreed.rest;

import com.designfreed.domain.TipoMovimiento;
import com.designfreed.services.TipoMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tipoMovimiento")
public class TipoMovimientoRestController {
    private TipoMovimientoService tipoMovimientoService;

    @Autowired
    public void setTipoMovimientoService(TipoMovimientoService tipoMovimientoService) {
        this.tipoMovimientoService = tipoMovimientoService;
    }

    @GetMapping("/list")
    public List<TipoMovimiento> findAll() {
        return tipoMovimientoService.findAll();
    }
}
