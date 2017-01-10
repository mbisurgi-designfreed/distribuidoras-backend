package com.designfreed.services.implementation;

import com.designfreed.domain.CondicionVenta;
import com.designfreed.repositories.CondicionVentaRepository;
import com.designfreed.services.CondicionVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class CondicionVentaServiceRepositoryImpl implements CondicionVentaService {
    private CondicionVentaRepository condicionVentaRepository;

    @Autowired
    public void setCondicionVentaRepository(CondicionVentaRepository condicionVentaRepository) {
        this.condicionVentaRepository = condicionVentaRepository;
    }

    @Override
    public List<CondicionVenta> findAll() {
        return (List<CondicionVenta>) condicionVentaRepository.findAll();
    }

    @Override
    public CondicionVenta findById(Long id) {
        return condicionVentaRepository.findOne(id);
    }

    @Override
    public CondicionVenta saveOrUpdate(CondicionVenta domainObject) {
        return condicionVentaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        condicionVentaRepository.delete(id);
    }
}
