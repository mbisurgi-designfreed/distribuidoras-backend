package com.designfreed.rest;

import com.designfreed.crm.domain.Cliente;
import com.designfreed.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteRestController {
    private ClienteService clienteService;

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping("/list")
    public List<Cliente> findAll() {
        return clienteService.findAll();
    }

    @GetMapping("/find/{id}")
    public Cliente findById(@PathVariable(name = "id") Long id) {
        return clienteService.findById(id);
    }

    @PostMapping("/update")
    public ResponseEntity<Cliente> update(@RequestBody Cliente cliente) {
        Cliente savedCliente = clienteService.saveOrUpdate(cliente);

        ResponseEntity<Cliente> response;

        if (savedCliente != null) {
            response = ResponseEntity.ok(savedCliente);
        } else {
            response = ResponseEntity.noContent().build();
        }

        return response;
    }
}
