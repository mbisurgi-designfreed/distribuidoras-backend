package com.designfreed.services;

import com.designfreed.crm.domain.Movimiento;
import org.springframework.beans.factory.annotation.Autowired;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
//@ActiveProfiles("jpa_repository")
public class MovimientoServiceRepositoryImplTest {
    MovimientoService movimientoService;

    @Autowired
    public void setMovimientoService(MovimientoService movimientoService) {
        this.movimientoService = movimientoService;
    }

//    @Test
//    public void testFindAll() throws Exception {
//        List<Movimiento> movimientos = movimientoService.findAll();
//
//        assert movimientos.size() == 27037;
//    }

    //@Test
    public void testFindById() throws Exception {
        Movimiento movimiento = movimientoService.findById(14807L);

        assert movimiento != null;
        assert movimiento.getHojaRuta() != null;

        System.out.println("Hoja Ruta ID");
        System.out.println(movimiento.getHojaRuta().getId());

        assert movimiento.getItems().size() == 2;
        assert movimiento.getItems().get(0).getEnvase().getEnvaseCodigo() == 1001;
        assert movimiento.getItems().get(0).getCantidad() == 1;

        System.out.println("Item 1 - Envase Codigo");
        System.out.println(movimiento.getItems().get(0).getEnvase().getEnvaseCodigo());

        System.out.println("Item 1 - Cantidad");
        System.out.println(movimiento.getItems().get(0).getCantidad());
    }
}
