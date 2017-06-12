package com.designfreed.services;

import com.designfreed.crm.domain.Cliente;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
//@ActiveProfiles("jpa_repository")
public class ClienteServiceRepositoryImplTest {
    private ClienteService clienteService;

    @Autowired
    public void setClienteService(ClienteService clienteService) {
        this.clienteService = clienteService;
    }


    //@Test
    public void testFindAll() throws Exception {
        List<Cliente> clientes = clienteService.findAll();

        assert clientes.size() == 15972;
    }

    //@Test
    public void testFindById() throws Exception {
        Cliente cliente = clienteService.findById(1L);

        assert cliente != null;
        assert cliente.getRazonSocial().equals("Amalia Fernandez");
        assert cliente.getCondicionVenta().getCondicionVentaNombre().equals("Contado");

        System.out.println("Razon Social");
        System.out.println(cliente.getRazonSocial());

        System.out.println("Condicion Venta");
        System.out.println(cliente.getCondicionVenta().getCondicionVentaNombre());
    }

//    @Test
//    public void testSaveOfCliente() throws Exception {
//        Cliente cliente = new Cliente();
//        cliente.setRazonSocial("Maximiliano Bisurgi");
//        cliente.setCalle("Ruta 52 km 3,5");
//        cliente.setAltura("249");
//        cliente.setCondicionVenta(new CondicionVenta());
//        cliente.getCondicionVenta().setCondicionVentaNombre("Cuenta Corriente");
//
//        Cliente savedCliente = clienteService.saveOrUpdate(cliente);
//
//        assert savedCliente.getId() != null;
//        assert savedCliente.getCondicionVenta().getId() != null;
//
//        System.out.println("Cliente ID");
//        System.out.println(savedCliente.getId());
//
//        System.out.println("Condicion Venta ID");
//        System.out.println(savedCliente.getCondicionVenta().getId());
//    }
}
