package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "EnvasesEstado")
public class EstadoEnvase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "EstadoEnvaseID")
    private Long id;

    @Column(name = "EstadoEnvaseNombre")
    private String estadoEnvaseNombre;

    public EstadoEnvase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstadoEnvaseNombre() {
        return estadoEnvaseNombre;
    }

    public void setEstadoEnvaseNombre(String estadoEnvaseNombre) {
        this.estadoEnvaseNombre = estadoEnvaseNombre;
    }
}
