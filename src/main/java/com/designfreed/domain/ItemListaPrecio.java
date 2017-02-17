package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "ListasPrecioDet")
public class ItemListaPrecio {
    @Id
    @GeneratedValue
    @Column(name = "ListaPrecioDetID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EnvaseID")
    private Envase envase;

    @Column(name = "Precio")
    private Float precio;

    public ItemListaPrecio() {
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

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
