package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Envase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnvaseRepository extends CrudRepository<Envase, Long> {
}
