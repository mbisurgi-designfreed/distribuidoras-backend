package com.designfreed.services;

import com.designfreed.domain.Chofer;
import com.designfreed.domain.HojaRuta;
import com.designfreed.services.generics.CRUDService;

import java.util.Date;

public interface HojaRutaService extends CRUDService<HojaRuta> {
    HojaRuta findByFechaAndChofer(Date fecha, Chofer chofer);
}
