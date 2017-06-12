package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.TipoMovimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TipoMovimientoRepository extends CrudRepository<TipoMovimiento, Long> {
}
