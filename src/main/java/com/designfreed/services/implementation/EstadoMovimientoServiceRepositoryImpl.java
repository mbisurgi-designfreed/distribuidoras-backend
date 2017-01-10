package com.designfreed.services.implementation;

import com.designfreed.domain.EstadoMovimiento;
import com.designfreed.repositories.EstadoMovimientoRepository;
import com.designfreed.services.EstadoMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class EstadoMovimientoServiceRepositoryImpl implements EstadoMovimientoService {
    private EstadoMovimientoRepository estadoMovimientoRepository;

    @Autowired
    public void setEstadoMovimientoRepository(EstadoMovimientoRepository estadoMovimientoRepository) {
        this.estadoMovimientoRepository = estadoMovimientoRepository;
    }

    @Override
    public List<EstadoMovimiento> findAll() {
        return (List<EstadoMovimiento>) estadoMovimientoRepository.findAll();
    }

    @Override
    public EstadoMovimiento findById(Long id) {
        return estadoMovimientoRepository.findOne(id);
    }

    @Override
    public EstadoMovimiento saveOrUpdate(EstadoMovimiento domainObject) {
        return estadoMovimientoRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        estadoMovimientoRepository.delete(id);
    }
}
