package com.designfreed.rest;

import com.designfreed.crm.domain.ListaPrecio;
import com.designfreed.services.ListaPrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/precio")
public class ListaPrecioRestController {
    private ListaPrecioService listaPrecioService;

    @Autowired
    public void setListaPrecioService(ListaPrecioService listaPrecioService) {
        this.listaPrecioService = listaPrecioService;
    }

    @GetMapping("/list")
    public List<ListaPrecio> findAll() {
        return listaPrecioService.findAll();
    }
}
