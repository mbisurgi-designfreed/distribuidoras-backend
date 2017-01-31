package com.designfreed.repositories;

import com.designfreed.domain.TipoMovimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMovimientoRepository extends CrudRepository<TipoMovimiento, Long> {
}
