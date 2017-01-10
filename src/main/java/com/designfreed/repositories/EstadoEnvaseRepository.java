package com.designfreed.repositories;

import com.designfreed.domain.EstadoEnvase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoEnvaseRepository extends CrudRepository<EstadoEnvase, Long> {
}
