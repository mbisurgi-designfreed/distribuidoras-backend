package com.designfreed.services;

import com.designfreed.configuration.JpaIntegrationConfiguration;
import com.designfreed.domain.Chofer;
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
public class ChoferServiceRepositoryImplTest {
    private ChoferService choferService;

    @Autowired
    public void setChoferService(ChoferService choferService) {
        this.choferService = choferService;
    }

    @Test
    public void testFindAll() throws Exception {
        List<Chofer> choferes = choferService.findAll();

        assert choferes.size() == 2;
    }

    @Test
    public void testFindById() throws Exception {
        Chofer chofer = choferService.findById(1L);

        assert chofer != null;
        assert chofer.getNombre().equals("Maximiliano");

        System.out.println("Nombre");
        System.out.println(chofer.getNombre());
    }

//    @Test
//    public void testSaveOfChofer() throws Exception {
//        Chofer chofer = new Chofer();
//        chofer.setNombre("Matias");
//        chofer.setApellido("Bisurgi");
//        chofer.setDni("36432967");
//
//        Chofer savedChofer = choferService.saveOrUpdate(chofer);
//
//        assert savedChofer.getId() != null;
//        assert savedChofer.getDni().equals("36432967");
//
//        System.out.println("Chofer ID");
//        System.out.println(savedChofer.getId());
//
//        System.out.println("Dni");
//        System.out.println(savedChofer.getDni());
//    }
}
