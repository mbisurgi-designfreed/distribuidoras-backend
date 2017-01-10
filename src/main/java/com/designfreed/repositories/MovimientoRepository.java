package com.designfreed.repositories;

import com.designfreed.domain.HojaRuta;
import com.designfreed.domain.Movimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovimientoRepository extends CrudRepository<Movimiento, Long> {
    List<Movimiento> findByHojaRuta(HojaRuta hojaRuta);
}
