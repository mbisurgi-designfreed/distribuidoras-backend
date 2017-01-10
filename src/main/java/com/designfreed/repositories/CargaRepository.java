package com.designfreed.repositories;

import com.designfreed.domain.Carga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CargaRepository extends CrudRepository<Carga, Long> {
}
