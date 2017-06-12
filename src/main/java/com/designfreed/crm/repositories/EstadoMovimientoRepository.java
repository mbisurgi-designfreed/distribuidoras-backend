package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.EstadoMovimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoMovimientoRepository extends CrudRepository<EstadoMovimiento, Long> {
}
