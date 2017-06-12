package com.designfreed.services;

import com.designfreed.crm.domain.EstadoMovimiento;
import com.designfreed.crm.domain.HojaRuta;
import com.designfreed.crm.domain.Movimiento;
import com.designfreed.services.generics.CRUDService;

import java.util.List;

public interface MovimientoService extends CRUDService<Movimiento> {
    List<Movimiento> findByHojaRuta(HojaRuta hojaRuta);

    List<Movimiento> findByHojaRutaEstado(HojaRuta hojaRuta, EstadoMovimiento estadoMovimiento);

    List<Movimiento> findByHojaRutaSincronizado(HojaRuta hojaRuta, Boolean sincronizado);

    Iterable<Movimiento> saveOrUpdateAll(List<Movimiento> movimientos);
}
