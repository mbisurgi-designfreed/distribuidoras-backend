package com.designfreed.services.implementation;

import com.designfreed.consolidado.domain.Empresa;
import com.designfreed.consolidado.repositories.EmpresaRepository;
import com.designfreed.services.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class EmpresaServiceRepositoryImpl implements EmpresaService {
    private EmpresaRepository empresaRepository;

    @Autowired
    public void setEmpresaRepository(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }

    @Override
    public List<Empresa> findAll() {
        return (List<Empresa>) empresaRepository.findAll();
    }

    @Override
    public Empresa findById(Long id) {
        return empresaRepository.findOne(id);
    }

    @Override
    public Empresa saveOrUpdate(Empresa domainObject) {
        return empresaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        empresaRepository.delete(id);
    }
}
