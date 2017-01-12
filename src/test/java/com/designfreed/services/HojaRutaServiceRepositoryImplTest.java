package com.designfreed.services;

import com.designfreed.configuration.JpaIntegrationConfiguration;
import com.designfreed.domain.Chofer;
import com.designfreed.domain.HojaRuta;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(JpaIntegrationConfiguration.class)
@ActiveProfiles("jpa_repository")
public class HojaRutaServiceRepositoryImplTest {
    private HojaRutaService hojaRutaService;
    private ChoferService choferService;

    @Autowired
    public void setHojaRutaService(HojaRutaService hojaRutaService) {
        this.hojaRutaService = hojaRutaService;
    }

    @Autowired
    public void setChoferService(ChoferService choferService) {
        this.choferService = choferService;
    }

//    @Test
//    public void testFindAll() throws Exception {
//        List<HojaRuta> hojas = hojaRutaService.findAll();
//
//        assert hojas.size() == 2;
//    }

    @Test
    public void testFindById() throws Exception {
        HojaRuta hojaRuta = hojaRutaService.findById(3L);

        assert hojaRuta != null;
        assert hojaRuta.getEstado() == true;

        System.out.println("Estado");
        System.out.println(hojaRuta.getEstado());
    }

//    @Test
//    public void testFindByFechaAndChofer() throws Exception {
//        Chofer chofer = choferService.findById(2L);
//
//        assert chofer != null;
//        assert chofer.getNombre().equals("Claudio");
//
//        System.out.println("Nombre");
//        System.out.println(chofer.getNombre());
//
//        HojaRuta hojaRuta = hojaRutaService.findByFechaAndChofer(new Date(1504224000000L), chofer);
//
//        assert hojaRuta != null;
//        assert hojaRuta.getEstado() == false;
//
//        System.out.println("Estado");
//        System.out.println(hojaRuta.getEstado());
//    }
}
