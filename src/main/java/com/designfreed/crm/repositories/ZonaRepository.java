package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Zona;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZonaRepository extends CrudRepository<Zona, Long> {
}
