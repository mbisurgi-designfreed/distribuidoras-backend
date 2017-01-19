package com.designfreed.rest;

import com.designfreed.domain.Chofer;
import com.designfreed.services.ChoferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chofer")
public class ChoferRestController {
    private ChoferService choferService;

    @Autowired
    public void setChoferService(ChoferService choferService) {
        this.choferService = choferService;
    }

    @GetMapping("/login/{dni}/{password}")
    public Chofer login(@PathVariable(name = "dni") String dni, @PathVariable(name = "password") String password) {
        return choferService.findByDniAndUsername(dni, password);
    }
}
