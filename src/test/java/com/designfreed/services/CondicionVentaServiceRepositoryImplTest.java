package com.designfreed.services;

import com.designfreed.configuration.JpaIntegrationConfiguration;
import com.designfreed.domain.CondicionVenta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
@ActiveProfiles("jpa_repository")
public class CondicionVentaServiceRepositoryImplTest {
    private CondicionVentaService condicionVentaService;

    @Autowired
    public void setCondicionVentaService(CondicionVentaService condicionVentaService) {
        this.condicionVentaService = condicionVentaService;
    }

    @Test
    public void testFindAll() throws Exception {
        List<CondicionVenta> condiciones = condicionVentaService.findAll();

        assert condiciones.size() == 2;
    }

    @Test
    public void testFindById() throws Exception {
        CondicionVenta condicionVenta = condicionVentaService.findById(1L);

        assert condicionVenta != null;
        assert condicionVenta.getCondicionVentaNombre().equals("Contado");

        System.out.println("Condicion Venta Nombre");
        System.out.println(condicionVenta.getCondicionVentaNombre());
    }

//    @Test
//    public void testSaveOfCondicionVenta() throws Exception {
//        CondicionVenta condicionVenta = new CondicionVenta();
//        condicionVenta.setCondicionVentaNombre("Cuenta Corriente");
//
//        CondicionVenta savedCondicionVenta = condicionVentaService.saveOrUpdate(condicionVenta);
//
//        assert savedCondicionVenta.getId() != null;
//        assert savedCondicionVenta.getCondicionVentaNombre().equals("Cuenta Corriente");
//
//        System.out.println("Condicion Venta ID");
//        System.out.println(savedCondicionVenta.getId());
//
//        System.out.println("Condicion Venta NombreD");
//        System.out.println(savedCondicionVenta.getCondicionVentaNombre());
//    }
}
