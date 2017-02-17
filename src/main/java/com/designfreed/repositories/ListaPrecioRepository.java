package com.designfreed.repositories;

import com.designfreed.domain.ListaPrecio;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ListaPrecioRepository extends CrudRepository<ListaPrecio, Long> {
}
