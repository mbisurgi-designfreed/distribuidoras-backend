package com.designfreed.services.implementation;

import com.designfreed.domain.EstadoEnvase;
import com.designfreed.repositories.EstadoEnvaseRepository;
import com.designfreed.services.EstadoEnvaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstadoEnvaseServiceRepositoryImpl implements EstadoEnvaseService {
    private EstadoEnvaseRepository estadoEnvaseRepository;

    @Autowired
    public void setEstadoEnvaseRepository(EstadoEnvaseRepository estadoEnvaseRepository) {
        this.estadoEnvaseRepository = estadoEnvaseRepository;
    }

    @Override
    public List<EstadoEnvase> findAll() {
        return (List<EstadoEnvase>) estadoEnvaseRepository.findAll();
    }

    @Override
    public EstadoEnvase findById(Long id) {
        return estadoEnvaseRepository.findOne(id);
    }

    @Override
    public EstadoEnvase saveOrUpdate(EstadoEnvase domainObject) {
        return estadoEnvaseRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        estadoEnvaseRepository.delete(id);
    }
}
