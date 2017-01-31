package com.designfreed.services;

import com.designfreed.domain.EstadoMovimiento;
import com.designfreed.domain.HojaRuta;
import com.designfreed.domain.Movimiento;
import com.designfreed.services.generics.CRUDService;

import java.util.List;

public interface MovimientoService extends CRUDService<Movimiento> {
    List<Movimiento> findByHojaRuta(HojaRuta hojaRuta);

    List<Movimiento> findByHojaRutaEstado(HojaRuta hojaRuta, EstadoMovimiento estadoMovimiento);

    List<Movimiento> findByHojaRutaSincronizado(HojaRuta hojaRuta, Boolean sincronizado);

    Iterable<Movimiento> saveOrUpdateAll(List<Movimiento> movimientos);
}
