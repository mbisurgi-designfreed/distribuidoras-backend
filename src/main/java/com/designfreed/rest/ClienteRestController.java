package com.designfreed.rest;

import com.designfreed.crm.domain.Cliente;
import com.designfreed.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    private ClienteService clienteService;

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/find/{id}")
    public Cliente findById(@PathVariable(name = "id") Long id) {
        return clienteService.findById(id);
    }
}
