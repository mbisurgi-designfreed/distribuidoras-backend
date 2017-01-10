package com.designfreed.repositories;

import com.designfreed.domain.TipoCarga;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoCargaRepository extends CrudRepository<TipoCarga, Long> {
}
