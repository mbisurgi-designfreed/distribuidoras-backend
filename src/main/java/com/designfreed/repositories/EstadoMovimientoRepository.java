package com.designfreed.repositories;

import com.designfreed.domain.EstadoMovimiento;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EstadoMovimientoRepository extends CrudRepository<EstadoMovimiento, Long> {
}
