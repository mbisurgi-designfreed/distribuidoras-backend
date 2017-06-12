package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "MovimientosTipo")
public class TipoMovimiento {
    @Id
    @GeneratedValue
    @Column(name = "TipoMovimientoID")
    private Long id;

    @Column(name = "TipoMovimientoNombre")
    private String tipoMovimientoNombre;

    public TipoMovimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoMovimientoNombre() {
        return tipoMovimientoNombre;
    }

    public void setTipoMovimientoNombre(String tipoMovimientoNombre) {
        this.tipoMovimientoNombre = tipoMovimientoNombre;
    }
}
