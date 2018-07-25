package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "ZonasSub")
public class SubZona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "SubZonaID")
    private Long id;

    @Column(name = "SubZonaNombre")
    private String subZonaNombre;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ZonaID")
    private Zona zona;

    public SubZona() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSubZonaNombre() {
        return subZonaNombre;
    }

    public void setSubZonaNombre(String subZonaNombre) {
        this.subZonaNombre = subZonaNombre;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
}
