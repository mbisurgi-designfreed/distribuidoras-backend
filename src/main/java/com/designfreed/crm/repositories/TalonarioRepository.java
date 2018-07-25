package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Talonario;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TalonarioRepository extends CrudRepository<Talonario, Long> {
}
