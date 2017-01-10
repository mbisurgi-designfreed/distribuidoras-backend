package com.designfreed.services.implementation;

import com.designfreed.domain.Chofer;
import com.designfreed.domain.HojaRuta;
import com.designfreed.repositories.HojaRutaRepository;
import com.designfreed.services.HojaRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
@Profile("jpa_repository")
public class HojaRutaServiceRepositoryImpl implements HojaRutaService {
    private HojaRutaRepository hojaRutaRepository;

    @Autowired
    public void setHojaRutaRepository(HojaRutaRepository hojaRutaRepository) {
        this.hojaRutaRepository = hojaRutaRepository;
    }

    @Override
    public List<HojaRuta> findAll() {
        return (List<HojaRuta>) hojaRutaRepository.findAll();
    }

    @Override
    public HojaRuta findById(Long id) {
        return hojaRutaRepository.findOne(id);
    }

    @Override
    public HojaRuta findByFechaAndChofer(Date fecha, Chofer chofer) {
        return hojaRutaRepository.findByFechaAndChofer(fecha, chofer);
    }

    @Override
    public HojaRuta saveOrUpdate(HojaRuta domainObject) {
        return hojaRutaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        hojaRutaRepository.delete(id);
    }
}
