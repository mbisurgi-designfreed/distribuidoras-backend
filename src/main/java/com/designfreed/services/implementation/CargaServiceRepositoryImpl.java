package com.designfreed.services.implementation;

import com.designfreed.domain.Carga;
import com.designfreed.domain.HojaRuta;
import com.designfreed.repositories.CargaRepository;
import com.designfreed.services.CargaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Profile("jpa_repository")
public class CargaServiceRepositoryImpl implements CargaService {
    private CargaRepository cargaRepository;

    @Autowired
    public void setCargaRepository(CargaRepository cargaRepository) {
        this.cargaRepository = cargaRepository;
    }

    @Override
    public List<Carga> findAll() {
        return (List<Carga>) cargaRepository.findAll();
    }

    @Override
    public Carga findById(Long id) {
        return cargaRepository.findOne(id);
    }

    @Override
    public List<Carga> findByHojaRuta(HojaRuta hojaRuta) {
        return cargaRepository.findByHojaRuta(hojaRuta);
    }

    @Override
    public Carga saveOrUpdate(Carga domainObject) {
        return cargaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        cargaRepository.delete(id);
    }
}
