package com.designfreed.services.implementation;

import com.designfreed.crm.domain.TipoCarga;
import com.designfreed.crm.repositories.TipoCargaRepository;
import com.designfreed.services.TipoCargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class TipoCargaServiceRepositoryImpl implements TipoCargaService {
    TipoCargaRepository tipoCargaRepository;

    @Autowired
    public void setTipoCargaRepository(TipoCargaRepository tipoCargaRepository) {
        this.tipoCargaRepository = tipoCargaRepository;
    }

    @Override
    public List<TipoCarga> findAll() {
        return (List<TipoCarga>) tipoCargaRepository.findAll();
    }

    @Override
    public TipoCarga findById(Long id) {
        return tipoCargaRepository.findOne(id);
    }

    @Override
    public TipoCarga saveOrUpdate(TipoCarga domainObject) {
        return tipoCargaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        tipoCargaRepository.delete(id);
    }
}
