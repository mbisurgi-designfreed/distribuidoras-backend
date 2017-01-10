package com.designfreed.repositories;

import com.designfreed.domain.CondicionVenta;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionVentaRepository extends CrudRepository<CondicionVenta, Long> {
}
