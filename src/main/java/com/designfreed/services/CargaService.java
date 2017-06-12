package com.designfreed.services;

import com.designfreed.crm.domain.Carga;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.services.generics.CRUDService;

import java.util.List;

public interface CargaService extends CRUDService<Carga> {
    List<Carga> findByHojaRuta(HojaRuta hojaRuta);
}
