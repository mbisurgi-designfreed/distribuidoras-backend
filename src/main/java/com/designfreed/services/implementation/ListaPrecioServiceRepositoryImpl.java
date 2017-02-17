package com.designfreed.services.implementation;

import com.designfreed.domain.ListaPrecio;
import com.designfreed.repositories.ListaPrecioRepository;
import com.designfreed.services.ListaPrecioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class ListaPrecioServiceRepositoryImpl implements ListaPrecioService {
    private ListaPrecioRepository listaPrecioRepository;

    @Autowired
    public void setListaPrecioRepository(ListaPrecioRepository listaPrecioRepository) {
        this.listaPrecioRepository = listaPrecioRepository;
    }

    @Override
    public List<ListaPrecio> findAll() {
        return (List<ListaPrecio>) listaPrecioRepository.findAll();
    }

    @Override
    public ListaPrecio findById(Long id) {
        return listaPrecioRepository.findOne(id);
    }

    @Override
    public ListaPrecio saveOrUpdate(ListaPrecio domainObject) {
        return listaPrecioRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        listaPrecioRepository.delete(id);
    }
}
