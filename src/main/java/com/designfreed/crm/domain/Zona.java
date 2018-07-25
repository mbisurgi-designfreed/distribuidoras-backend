package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "Zonas")
public class Zona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ZonaID")
    private Long id;

    @Column(name = "ZonaNombre")
    private String zonaNombre;

    public Zona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getZonaNombre() {
        return zonaNombre;
    }

    public void setZonaNombre(String zonaNombre) {
        this.zonaNombre = zonaNombre;
    }
}
