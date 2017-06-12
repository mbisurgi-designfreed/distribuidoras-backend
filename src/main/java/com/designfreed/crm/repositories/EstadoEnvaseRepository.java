package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.EstadoEnvase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoEnvaseRepository extends CrudRepository<EstadoEnvase, Long> {
}
