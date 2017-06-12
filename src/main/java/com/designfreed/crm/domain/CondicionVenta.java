package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "CondicionesVenta")
public class CondicionVenta {
    @Id
    @GeneratedValue
    @Column(name = "CondicionVentaID")
    private Long id;

    @Column(name = "CondicionVentaNombre")
    private String condicionVentaNombre;

    public CondicionVenta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCondicionVentaNombre() {
        return condicionVentaNombre;
    }

    public void setCondicionVentaNombre(String condicionVentaNombre) {
        this.condicionVentaNombre = condicionVentaNombre;
    }
}
