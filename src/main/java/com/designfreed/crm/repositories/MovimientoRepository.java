package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.EstadoMovimiento;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.crm.domain.Movimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Long> {
    List<Movimiento> findByHojaRuta(HojaRuta hojaRuta);

    List<Movimiento> findByHojaRutaAndEstadoMovimiento(HojaRuta hojaRuta, EstadoMovimiento estadoMovimiento);

    List<Movimiento> findByHojaRutaAndSincronizado(HojaRuta hojaRuta, Boolean sincronizado);
}
