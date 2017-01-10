package com.designfreed.services.implementation;

import com.designfreed.domain.Cliente;
import com.designfreed.repositories.ClienteRepository;
import com.designfreed.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class ClienteServiceRepositoryImpl implements ClienteService {
    private ClienteRepository clienteRepository;

    @Autowired
    public void setClienteRepository(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteRepository.findAll();
    }

    @Override
    public Cliente findById(Long id) {
        return clienteRepository.findOne(id);
    }

    @Override
    public Cliente saveOrUpdate(Cliente domainObject) {
        return clienteRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        clienteRepository.delete(id);
    }
}
