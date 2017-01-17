package com.designfreed.services;

import com.designfreed.configuration.JpaIntegrationConfiguration;
import com.designfreed.domain.Envase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
//@ActiveProfiles("jpa_repository")
public class EnvaseServiceRepositoryImplTest {
    private EnvaseService envaseService;

    @Autowired
    public void setEnvaseService(EnvaseService envaseService) {
        this.envaseService = envaseService;
    }

    //@Test
    public void testFindAll() throws Exception {
        List<Envase> envases = envaseService.findAll();

        assert envases.size() == 14;
    }

    //@Test
    public void testFindById() throws Exception {
        Envase envase = envaseService.findById(1L);

        assert envase != null;
        assert envase.getEnvaseNombre().equals("Garrafa 10kg");

        System.out.println("Envase Nombre");
        System.out.println(envase.getEnvaseNombre());
    }

//    @Test
//    public void testSaveOfEnvase() throws Exception {
//        Envase envase = new Envase();
//        envase.setEnvaseCodigo(1003);
//        envase.setEnvaseNombre("Garrafa 15kg ME");
//        envase.setKilos(15f);
//
//        Envase savedEnvase = envaseService.saveOrUpdate(envase);
//
//        assert savedEnvase.getId() != null;
//        assert savedEnvase.getEnvaseCodigo() == 1003;
//
//        System.out.println("Envase ID");
//        System.out.println(savedEnvase.getId());
//
//        System.out.println("Envase Codigo");
//        System.out.println(savedEnvase.getEnvaseCodigo());
//    }
}
