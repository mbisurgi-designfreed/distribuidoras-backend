package com.designfreed.services;

import com.designfreed.configuration.JpaIntegrationConfiguration;
import com.designfreed.domain.EstadoEnvase;
import com.designfreed.domain.ItemMovimientoStock;
import com.designfreed.domain.MovimientoStock;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
@ActiveProfiles("jpa_repository")
public class MovimientoStockServiceRepositoryImplTest {
    private MovimientoStockService movimientoStockService;
    private EnvaseService envaseService;
    private HojaRutaService hojaRutaService;
    private EstadoEnvaseService estadoEnvaseService;

    @Autowired
    public void setMovimientoStockService(MovimientoStockService movimientoStockService) {
        this.movimientoStockService = movimientoStockService;
    }

    @Autowired
    public void setEnvaseService(EnvaseService envaseService) {
        this.envaseService = envaseService;
    }

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @Autowired
    public void setEstadoEnvaseService(EstadoEnvaseService estadoEnvaseService) {
        this.estadoEnvaseService = estadoEnvaseService;
    }

    @Test
    public void testFindAll() throws Exception {
        List<MovimientoStock> movimientos = movimientoStockService.findAll();

        assert movimientos.size() == 1;
    }

    @Test
    public void testFindById() throws Exception {
        MovimientoStock movimiento = movimientoStockService.findById(721L);

        assert movimiento != null;
        assert movimiento.getHojaRuta() == null;

        assert movimiento.getItems().size() == 5;
        assert movimiento.getItems().get(0).getEnvase().getEnvaseCodigo() == 1001;
        assert movimiento.getItems().get(0).getEstadoEnvase().getEstadoEnvaseNombre().equals("Lleno");

        System.out.println("Item 1 - Envase Codigo");
        System.out.println(movimiento.getItems().get(0).getEnvase().getEnvaseCodigo());

        System.out.println("Item 1 - Estado Envase");
        System.out.println(movimiento.getItems().get(0).getEstadoEnvase().getEstadoEnvaseNombre());
    }

//    @Test
//    public void testSaveOfMovimientoStock() throws Exception {
//        MovimientoStock movimiento = new MovimientoStock();
//        movimiento.setFecha(new Date(1504224000000L));
//        movimiento.setHojaRuta(hojaRutaService.findById(1L));
//        movimiento.setTipoMovimiento("Compra");
//        movimiento.setModulo("Stock");
//        movimiento.setNroComprobante("0001000542378");
//        movimiento.setItems(new ArrayList<ItemMovimientoStock>());
//
//        ItemMovimientoStock item1 = new ItemMovimientoStock();
//        item1.setEnvase(envaseService.findById(2L));
//        item1.setEstadoEnvase(estadoEnvaseService.findById(1L));
//        item1.setCantidad(15);
//        item1.setCosto(500f);
//        item1.setComodatoGenerado(false);
//        movimiento.getItems().add(item1);
//
//        ItemMovimientoStock item2 = new ItemMovimientoStock();
//        item2.setEnvase(envaseService.findById(2L));
//        item2.setEstadoEnvase(estadoEnvaseService.findById(2L));
//        item2.setCantidad(15);
//        item2.setCosto(500f);
//        item2.setComodatoGenerado(false);
//        movimiento.getItems().add(item2);
//
//        MovimientoStock savedMovimiento = movimientoStockService.saveOrUpdate(movimiento);
//
//        assert savedMovimiento.getId() != null;
//
//        System.out.println("Movimiento Stock ID");
//        System.out.println(savedMovimiento.getId());
//
//        assert savedMovimiento.getHojaRuta() != null;
//        assert savedMovimiento.getItems().get(0).getEnvase() != null;
//        assert savedMovimiento.getItems().get(0).getEstadoEnvase() != null;
//
//        System.out.println("Hoja Ruta ID");
//        System.out.println(savedMovimiento.getHojaRuta().getId());
//
//        System.out.println("Envase ID");
//        System.out.println(savedMovimiento.getItems().get(0).getEnvase().getId());
//
//        System.out.println("Estado Envase ID");
//        System.out.println(savedMovimiento.getItems().get(0).getEstadoEnvase().getId());
//    }
}
