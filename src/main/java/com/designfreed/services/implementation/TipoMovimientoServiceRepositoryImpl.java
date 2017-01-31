package com.designfreed.services.implementation;

import com.designfreed.domain.TipoMovimiento;
import com.designfreed.repositories.TipoMovimientoRepository;
import com.designfreed.services.TipoMovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class TipoMovimientoServiceRepositoryImpl implements TipoMovimientoService {
    private TipoMovimientoRepository tipoMovimientoRepository;

    @Autowired
    public void setTipoMovimientoRepository(TipoMovimientoRepository tipoMovimientoRepository) {
        this.tipoMovimientoRepository = tipoMovimientoRepository;
    }

    @Override
    public List<TipoMovimiento> findAll() {
        return (List<TipoMovimiento>) tipoMovimientoRepository.findAll();
    }

    @Override
    public TipoMovimiento findById(Long id) {
        return tipoMovimientoRepository.findOne(id);
    }

    @Override
    public TipoMovimiento saveOrUpdate(TipoMovimiento domainObject) {
        return tipoMovimientoRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        tipoMovimientoRepository.delete(id);
    }
}
