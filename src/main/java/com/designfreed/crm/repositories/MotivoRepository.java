package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Motivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRepository extends CrudRepository<Motivo, Long> {
}
