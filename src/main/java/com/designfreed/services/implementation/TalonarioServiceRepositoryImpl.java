package com.designfreed.services.implementation;

import com.designfreed.crm.domain.Talonario;
import com.designfreed.crm.repositories.TalonarioRepository;
import com.designfreed.services.TalonarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class TalonarioServiceRepositoryImpl implements TalonarioService {
    private TalonarioRepository talonarioRepository;

    @Autowired
    public void setTalonarioRepository(TalonarioRepository talonarioRepository) {
        this.talonarioRepository = talonarioRepository;
    }

    @Override
    public List<Talonario> findAll() {
        return (List<Talonario>) talonarioRepository.findAll();
    }

    @Override
    public Talonario findById(Long id) {
        return null;
    }

    @Override
    public Talonario saveOrUpdate(Talonario domainObject) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
