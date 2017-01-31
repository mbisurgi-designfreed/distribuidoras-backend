package com.designfreed.repositories;

import com.designfreed.domain.Motivo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotivoRepository extends CrudRepository<Motivo, Long> {
}
