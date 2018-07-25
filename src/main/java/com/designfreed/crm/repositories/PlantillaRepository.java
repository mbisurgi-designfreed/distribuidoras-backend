package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Plantilla;
import com.designfreed.crm.domain.Zona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlantillaRepository extends CrudRepository<Plantilla, Long> {
    List<Plantilla> findByClienteSubZonaZonaAndDiaSemana(Zona zona, String diaSemana);
}
