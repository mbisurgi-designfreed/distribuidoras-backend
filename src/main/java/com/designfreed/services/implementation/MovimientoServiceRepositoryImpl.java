package com.designfreed.services.implementation;

import com.designfreed.domain.Movimiento;
import com.designfreed.repositories.MovimientoRepository;
import com.designfreed.services.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class MovimientoServiceRepositoryImpl implements MovimientoService {
    private MovimientoRepository movimientoRepository;

    @Autowired
    public void setMovimientoRepository(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    @Override
    public List<Movimiento> findAll() {
        return (List<Movimiento>) movimientoRepository.findAll();
    }

    @Override
    public Movimiento findById(Long id) {
        return movimientoRepository.findOne(id);
    }

    @Override
    public Movimiento saveOrUpdate(Movimiento domainObject) {
        return movimientoRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        movimientoRepository.delete(id);
    }
}
