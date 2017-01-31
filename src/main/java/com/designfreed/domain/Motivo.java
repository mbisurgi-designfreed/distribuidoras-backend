package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "Motivos")
public class Motivo {
    @Id
    @GeneratedValue
    @Column(name = "MotivoID")
    private Long id;

    @Column(name = "MotivoNombre")
    private String motivoNombre;

    public Motivo() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMotivoNombre() {
        return motivoNombre;
    }

    public void setMotivoNombre(String motivoNombre) {
        this.motivoNombre = motivoNombre;
    }
}
