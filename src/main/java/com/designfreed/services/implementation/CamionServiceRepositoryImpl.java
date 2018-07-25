package com.designfreed.services.implementation;

import com.designfreed.crm.domain.Camion;
import com.designfreed.crm.repositories.CamionRepository;
import com.designfreed.services.CamionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class CamionServiceRepositoryImpl implements CamionService {
    private CamionRepository camionRepository;

    @Autowired
    public void setCamionRepository(CamionRepository camionRepository) {
        this.camionRepository = camionRepository;
    }

    @Override
    public List<Camion> findAll() {
        return (List<Camion>) camionRepository.findAll();
    }

    @Override
    public Camion findById(Long id) {
        return null;
    }

    @Override
    public Camion saveOrUpdate(Camion domainObject) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
