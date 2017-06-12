package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "MovimientosEstado")
public class EstadoMovimiento {
    @Id
    @GeneratedValue
    @Column(name = "EstadoMovimientoID")
    private Long id;

    @Column(name = "EstadoMovimientoNombre")
    private String estadoMovimientoNombre;

    public EstadoMovimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEstadoMovimientoNombre() {
        return estadoMovimientoNombre;
    }

    public void setEstadoMovimientoNombre(String estadoMovimientoNombre) {
        this.estadoMovimientoNombre = estadoMovimientoNombre;
    }
}
