package com.designfreed.services.implementation;

import com.designfreed.domain.Envase;
import com.designfreed.repositories.EnvaseRepository;
import com.designfreed.services.EnvaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class EnvaseServiceRepositoryImpl implements EnvaseService {
    private EnvaseRepository envaseRepository;

    @Autowired
    public void setEnvaseRepository(EnvaseRepository envaseRepository) {
        this.envaseRepository = envaseRepository;
    }

    @Override
    public List<Envase> findAll() {
        return (List<Envase>) envaseRepository.findAll();
    }

    @Override
    public Envase findById(Long id) {
        return envaseRepository.findOne(id);
    }

    @Override
    public Envase saveOrUpdate(Envase domainObject) {
        return envaseRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        envaseRepository.delete(id);
    }
}
