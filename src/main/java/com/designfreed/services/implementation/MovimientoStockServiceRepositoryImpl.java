package com.designfreed.services.implementation;

import com.designfreed.domain.MovimientoStock;
import com.designfreed.repositories.MovimientoStockRepository;
import com.designfreed.services.MovimientoStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovimientoStockServiceRepositoryImpl implements MovimientoStockService {
    private MovimientoStockRepository movimientoStockRepository;

    @Autowired
    public void setMovimientoStockRepository(MovimientoStockRepository movimientoStockRepository) {
        this.movimientoStockRepository = movimientoStockRepository;
    }

    @Override
    public List<MovimientoStock> findAll() {
        return (List<MovimientoStock>) movimientoStockRepository.findAll();
    }

    @Override
    public MovimientoStock findById(Long id) {
        return movimientoStockRepository.findOne(id);
    }

    @Override
    public MovimientoStock saveOrUpdate(MovimientoStock domainObject) {
        return movimientoStockRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        movimientoStockRepository.delete(id);
    }
}
