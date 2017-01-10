package com.designfreed.repositories;

import com.designfreed.domain.Chofer;
import com.designfreed.domain.HojaRuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HojaRutaRepository extends CrudRepository<HojaRuta, Long> {
    HojaRuta findByFechaAndChofer(Date fecha, Chofer chofer);

    List<HojaRuta> findByFecha(Date fecha);
}
