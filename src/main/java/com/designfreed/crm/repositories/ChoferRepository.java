package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.Chofer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChoferRepository extends CrudRepository<Chofer, Long> {
    Chofer findByDniAndPassword(String dni, String password);
}
