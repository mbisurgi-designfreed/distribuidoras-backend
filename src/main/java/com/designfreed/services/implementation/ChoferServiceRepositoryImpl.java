package com.designfreed.services.implementation;

import com.designfreed.domain.Chofer;
import com.designfreed.repositories.ChoferRepository;
import com.designfreed.services.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class ChoferServiceRepositoryImpl implements ChoferService {
    private ChoferRepository choferRepository;

    @Autowired
    public void setChoferRepository(ChoferRepository choferRepository) {
        this.choferRepository = choferRepository;
    }

    @Override
    public List<Chofer> findAll() {
        return (List<Chofer>) choferRepository.findAll();
    }

    @Override
    public Chofer findById(Long id) {
        return choferRepository.findOne(id);
    }

    @Override
    public Chofer findByDniAndUsername(String dni, String password) {
        return choferRepository.findByDniAndPassword(dni, password);
    }

    @Override
    public Chofer saveOrUpdate(Chofer domainObject) {
        return choferRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        choferRepository.delete(id);
    }
}
