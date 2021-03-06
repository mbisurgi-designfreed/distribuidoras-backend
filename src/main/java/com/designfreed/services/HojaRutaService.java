package com.designfreed.services;

import com.designfreed.crm.domain.Chofer;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.services.generics.CRUDService;

import java.util.Date;
import java.util.List;

public interface HojaRutaService extends CRUDService<HojaRuta> {
    HojaRuta findByFechaAndChofer(Date fecha, Chofer chofer);

    List<HojaRuta> findByFecha(Date fecha);
}
