package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Chofer;
import com.designfreed.crm.domain.HojaRuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface HojaRutaRepository extends CrudRepository<HojaRuta, Long> {
    HojaRuta findByFechaAndChofer(Date fecha, Chofer chofer);

    List<HojaRuta> findByFecha(Date fecha);
}
