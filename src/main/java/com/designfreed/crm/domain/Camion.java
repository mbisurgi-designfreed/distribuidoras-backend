package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "Camiones")
public class Camion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CamionID")
    private Long id;

    @Column(name = "Patente")
    private String patente;

    @Column(name = "Marca")
    private String marca;

    public Camion() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
