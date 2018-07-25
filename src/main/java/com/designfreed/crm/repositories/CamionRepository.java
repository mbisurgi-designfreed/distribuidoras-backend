package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Camion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CamionRepository extends CrudRepository<Camion, Long> {
}
