package com.designfreed.services.implementation;

import com.designfreed.domain.EstadoMovimiento;
import com.designfreed.domain.HojaRuta;
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
    public List<Movimiento> findByHojaRuta(HojaRuta hojaRuta) {
        return movimientoRepository.findByHojaRuta(hojaRuta);
    }

    @Override
    public List<Movimiento> findByHojaRutaEstado(HojaRuta hojaRuta, EstadoMovimiento estadoMovimiento) {
        return movimientoRepository.findByHojaRutaAndEstadoMovimiento(hojaRuta, estadoMovimiento);
    }

    @Override
    public List<Movimiento> findByHojaRutaSincronizado(HojaRuta hojaRuta, Boolean sincronizado) {
        return movimientoRepository.findByHojaRutaAndSincronizado(hojaRuta, sincronizado);
    }

    @Override
    public Movimiento saveOrUpdate(Movimiento domainObject) {
        return movimientoRepository.save(domainObject);
    }

    @Override
    public Iterable<Movimiento> saveOrUpdateAll(List<Movimiento> movimientos) {
        return movimientoRepository.save(movimientos);
    }

    @Override
    public void delete(Long id) {
        movimientoRepository.delete(id);
    }
}
