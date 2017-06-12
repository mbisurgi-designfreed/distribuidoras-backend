package com.designfreed.services.implementation;

import com.designfreed.crm.domain.Motivo;
import com.designfreed.crm.repositories.MotivoRepository;
import com.designfreed.services.MotivoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class MotivoServiceRepositoryImpl implements MotivoService {
    private MotivoRepository motivoRepository;

    @Autowired
    public void setMotivoRepository(MotivoRepository motivoRepository) {
        this.motivoRepository = motivoRepository;
    }

    @Override
    public List<Motivo> findAll() {
        return (List<Motivo>) motivoRepository.findAll();
    }

    @Override
    public Motivo findById(Long id) {
        return motivoRepository.findOne(id);
    }

    @Override
    public Motivo saveOrUpdate(Motivo domainObject) {
        return motivoRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        motivoRepository.delete(id);
    }
}
