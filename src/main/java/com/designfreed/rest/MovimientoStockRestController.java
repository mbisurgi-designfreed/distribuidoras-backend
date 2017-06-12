package com.designfreed.rest;

import com.designfreed.crm.domain.MovimientoStock;
import com.designfreed.services.MovimientoStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movimientoStock")
public class MovimientoStockRestController {
    MovimientoStockService movimientoStockService;

    @Autowired
    public void setMovimientoService(MovimientoStockService movimientoStockService) {
        this.movimientoStockService = movimientoStockService;
    }

    @PostMapping("/add")
    public ResponseEntity<MovimientoStock> add(@RequestBody MovimientoStock movimiento) {
        MovimientoStock savedMovimientoStock = movimientoStockService.saveOrUpdate(movimiento);

        ResponseEntity<MovimientoStock> response;

        if (savedMovimientoStock != null) {
            response = ResponseEntity.ok(savedMovimientoStock);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }
}
