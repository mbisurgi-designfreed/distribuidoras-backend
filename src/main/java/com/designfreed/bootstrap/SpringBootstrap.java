package com.designfreed.bootstrap;

import com.designfreed.domain.*;
import com.designfreed.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Date;

@Component
public class SpringBootstrap implements ApplicationListener<ContextRefreshedEvent> {
    ClienteService clienteService;
    HojaRutaService hojaRutaService;
    EnvaseService envaseService;
    EstadoEnvaseService estadoEnvaseService;
    MovimientoStockService movimientoStockService;

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @Autowired
    public void setEnvaseService(EnvaseService envaseService) {
        this.envaseService = envaseService;
    }

    @Autowired
    public void setEstadoEnvaseService(EstadoEnvaseService estadoEnvaseService) {
        this.estadoEnvaseService = estadoEnvaseService;
    }

    @Autowired
    public void setMovimientoStockService(MovimientoStockService movimientoStockService) {
        this.movimientoStockService = movimientoStockService;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
//        loadClientes();
//        loadHojasRuta();
//        loadEnvases();
//        loadEstadosEnvase();
//        loadMovimientosStock();
    }

    private void loadClientes() {
        Cliente cliente1 = new Cliente();
        cliente1.setRazonSocial("Maximiliano Bisurgi");
        cliente1.setCalle("Ruta 52 km 3,5");
        cliente1.setAltura("249");
        cliente1.setCondicionVenta(new CondicionVenta());
        cliente1.getCondicionVenta().setCondicionVentaNombre("Contado");

        clienteService.saveOrUpdate(cliente1);
    }

    private void loadEnvases() {
        Envase envase1 = new Envase();
        envase1.setEnvaseCodigo(1001);
        envase1.setEnvaseNombre("Garrafa 10kg");
        envase1.setKilos(10f);

        envaseService.saveOrUpdate(envase1);

        Envase envase2 = new Envase();
        envase2.setEnvaseCodigo(1002);
        envase2.setEnvaseNombre("Garrafa 15kg");
        envase2.setKilos(15f);

        envaseService.saveOrUpdate(envase2);
    }

    private void loadEstadosEnvase() {
        EstadoEnvase estado1 = new EstadoEnvase();
        estado1.setEstadoEnvaseNombre("Lleno");

        estadoEnvaseService.saveOrUpdate(estado1);

        EstadoEnvase estado2 = new EstadoEnvase();
        estado1.setEstadoEnvaseNombre("Vacio");

        estadoEnvaseService.saveOrUpdate(estado2);
    }

    private void loadHojasRuta() {
        HojaRuta hojaRuta1 = new HojaRuta();
        hojaRuta1.setFecha(new Date(1504224000000L));
        hojaRuta1.setChofer(new Chofer());
        hojaRuta1.getChofer().setNombre("Maximiliano");
        hojaRuta1.getChofer().setApellido("Bisurgi");
        hojaRuta1.getChofer().setDni("33899255");
        hojaRuta1.setEstado(true);
        hojaRuta1.setControlStock(false);

        hojaRutaService.saveOrUpdate(hojaRuta1);

        HojaRuta hojaRuta2 = new HojaRuta();
        hojaRuta2.setFecha(new Date(1504224000000L));
        hojaRuta2.setChofer(new Chofer());
        hojaRuta2.getChofer().setNombre("Claudio");
        hojaRuta2.getChofer().setApellido("Bisurgi");
        hojaRuta2.getChofer().setDni("14315108");
        hojaRuta2.setEstado(false);
        hojaRuta2.setControlStock(true);

        hojaRutaService.saveOrUpdate(hojaRuta2);
    }

    private void loadMovimientosStock() {
        MovimientoStock movimientoStock1 = new MovimientoStock();
        movimientoStock1.setFecha(new Date(1504224000000L));
        movimientoStock1.setHojaRuta(hojaRutaService.findById(1L));
        movimientoStock1.setTipoMovimiento("Compra");
        movimientoStock1.setModulo("Stock");
        movimientoStock1.setNroComprobante("000100042123");
        movimientoStock1.setItems(new ArrayList<ItemMovimientoStock>());

        ItemMovimientoStock item1 = new ItemMovimientoStock();
        item1.setEnvase(envaseService.findById(1L));
        item1.setEstadoEnvase(estadoEnvaseService.findById(1L));
        item1.setCantidad(10);
        item1.setCosto(450f);
        item1.setComodatoGenerado(false);
        movimientoStock1.getItems().add(item1);

        ItemMovimientoStock item2 = new ItemMovimientoStock();
        item2.setEnvase(envaseService.findById(1L));
        item2.setEstadoEnvase(estadoEnvaseService.findById(2L));
        item2.setCantidad(10);
        item2.setCosto(450f);
        item2.setComodatoGenerado(false);
        movimientoStock1.getItems().add(item2);

        movimientoStockService.saveOrUpdate(movimientoStock1);
    }
}
