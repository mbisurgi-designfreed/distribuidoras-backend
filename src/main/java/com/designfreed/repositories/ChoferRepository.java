package com.designfreed.repositories;

import com.designfreed.domain.Chofer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoferRepository extends CrudRepository<Chofer, Long> {
}
