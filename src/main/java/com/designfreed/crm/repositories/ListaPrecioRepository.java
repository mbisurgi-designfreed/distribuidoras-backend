package com.designfreed.crm.repositories;

import com.designfreed.crm.domain.ListaPrecio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaPrecioRepository extends CrudRepository<ListaPrecio, Long> {
}
