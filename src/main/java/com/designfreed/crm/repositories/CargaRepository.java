package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Carga;
import com.designfreed.crm.domain.HojaRuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Long> {
    List<Carga> findByHojaRuta(HojaRuta hojaRuta);
}
