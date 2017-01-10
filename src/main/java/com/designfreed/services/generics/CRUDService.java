package com.designfreed.services.generics;

import java.util.List;

public interface CRUDService<T> {
    List<T> findAll();

    T findById(Long id);

    T saveOrUpdate(T domainObject);

    void delete(Long id);
}
