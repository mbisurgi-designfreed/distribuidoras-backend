package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.MovimientoStock;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovimientoStockRepository extends CrudRepository<MovimientoStock, Long> {
}
