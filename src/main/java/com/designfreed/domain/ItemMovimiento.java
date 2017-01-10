package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "MovimientosDet")
public class ItemMovimiento {
    @Id
    @GeneratedValue
    @Column(name = "MovimientoDetID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EnvaseID")
    private Envase envase;

    @Column(name = "Cantidad")
    private Integer cantidad;

    public ItemMovimiento() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Envase getEnvase() {
        return envase;
    }

    public void setEnvase(Envase envase) {
        this.envase = envase;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }
}
