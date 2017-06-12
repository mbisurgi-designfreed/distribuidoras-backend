package com.designfreed.services.implementation;

import com.designfreed.consolidado.repositories.EmpresaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("jpa_repository")
public class EmpresaServiceRepositoryImpl {
    private EmpresaRepository empresaRepository;

    @Autowired
    public void setEmpresaRepository(EmpresaRepository empresaRepository) {
        this.empresaRepository = empresaRepository;
    }
}
