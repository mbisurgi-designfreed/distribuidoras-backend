package com.designfreed.services.implementation;

import com.designfreed.crm.domain.Zona;
import com.designfreed.crm.repositories.ZonaRepository;
import com.designfreed.services.ZonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class ZonaServiceRepositoryImpl implements ZonaService {
    private ZonaRepository zonaRepository;

    @Autowired
    public void setZonaRepository(ZonaRepository zonaRepository) {
        this.zonaRepository = zonaRepository;
    }

    @Override
    public List<Zona> findAll() {
        return (List<Zona>) zonaRepository.findAll();
    }

    @Override
    public Zona findById(Long id) {
        return null;
    }

    @Override
    public Zona saveOrUpdate(Zona domainObject) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
