package com.designfreed.services;

import com.designfreed.crm.domain.Chofer;
import com.designfreed.services.generics.CRUDService;

public interface ChoferService extends CRUDService<Chofer> {
    Chofer findByDniAndUsername(String dni, String password);
}
