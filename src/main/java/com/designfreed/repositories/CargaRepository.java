package com.designfreed.repositories;

import com.designfreed.domain.Carga;
import com.designfreed.domain.HojaRuta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Long> {
    List<Carga> findByHojaRuta(HojaRuta hojaRuta);
}
