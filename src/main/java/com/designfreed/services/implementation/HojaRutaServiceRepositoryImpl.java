package com.designfreed.services.implementation;

import com.designfreed.crm.domain.*;
import com.designfreed.crm.repositories.*;
import com.designfreed.services.HojaRutaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
@Profile("jpa_repository")
public class HojaRutaServiceRepositoryImpl implements HojaRutaService {
    private HojaRutaRepository hojaRutaRepository;
    private PlantillaRepository plantillaRepository;
    private MovimientoRepository movimientoRepository;
    private TipoMovimientoRepository tipoMovimientoRepository;
    private EstadoMovimientoRepository estadoMovimientoRepository;

    @Autowired
    public void setHojaRutaRepository(HojaRutaRepository hojaRutaRepository) {
        this.hojaRutaRepository = hojaRutaRepository;
    }

    @Autowired
    public void setPlantillaRepository(PlantillaRepository plantillaRepository) {
        this.plantillaRepository = plantillaRepository;
    }

    @Autowired
    public void setMovimientoRepository(MovimientoRepository movimientoRepository) {
        this.movimientoRepository = movimientoRepository;
    }

    @Autowired
    public void setTipoMovimientoRepository(TipoMovimientoRepository tipoMovimientoRepository) {
        this.tipoMovimientoRepository = tipoMovimientoRepository;
    }

    @Autowired
    public void setEstadoMovimientoRepository(EstadoMovimientoRepository estadoMovimientoRepository) {
        this.estadoMovimientoRepository = estadoMovimientoRepository;
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
    public List<HojaRuta> findByFecha(Date fecha) {
        return hojaRutaRepository.findByFecha(fecha);
    }

    @Override
    public HojaRuta saveOrUpdate(HojaRuta domainObject) {
        if (domainObject.getId() == null) {
            List<Plantilla> plantillas = plantillaRepository.findByClienteSubZonaZonaAndDiaSemana(domainObject.getZona(), getDiaSemana(domainObject.getFecha()));

            List<Movimiento> movimientos = new ArrayList<>();

            HojaRuta hoja = hojaRutaRepository.save(domainObject);

            for (Plantilla pla: plantillas) {
                Movimiento mov = new Movimiento();

                mov.setFecha(hoja.getFecha());
                mov.setCliente(pla.getCliente());
                mov.setCondicionVenta(pla.getCliente().getCondicionVenta());
                mov.setTipoMovimiento(tipoMovimientoRepository.findOne(1L));
                mov.setEstadoMovimiento(estadoMovimientoRepository.findOne(1L));
                mov.setHojaRuta(hoja);
                mov.setVisito(false);
                mov.setVendio(false);
                mov.setMotivo(null);
                mov.setReclamo(false);
                mov.setObservaciones("");

                movimientos.add(mov);
            }

            movimientoRepository.save(movimientos);

            return hoja;
        }

        return hojaRutaRepository.save(domainObject);
    }

    @Override
    public void delete(Long id) {
        hojaRutaRepository.delete(id);
    }

    private String getDiaSemana(Date fecha) {
        Calendar date = new GregorianCalendar();
        date.setTime(fecha);

        switch (date.get(Calendar.DAY_OF_WEEK)) {
            case 1:
                return "domingo";
            case 2:
                return "lunes";
            case 3:
                return "martes";
            case 4:
                return "miércoles";
            case 5:
                return "jueves";
            case 6:
                return "viernes";
            case 7:
                return "sábado";
                default:
                    return "domingo";
        }
    }
}
