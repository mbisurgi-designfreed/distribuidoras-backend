package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "MovimientosStockDet")
public class ItemMovimientoStock {
    @Id
    @GeneratedValue
    @Column(name = "MovimientoStockDetID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EnvaseID")
    private Envase envase;

    @OneToOne
    @JoinColumn(name = "EstadoEnvaseID")
    private EstadoEnvase estadoEnvase;

    @Column(name = "Cantidad")
    private Integer cantidad;

    @Column(name = "Costo")
    private Float costo;

    @Column(name = "ComodatoGenerado")
    private Boolean comodatoGenerado;

    public ItemMovimientoStock() {
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

    public EstadoEnvase getEstadoEnvase() {
        return estadoEnvase;
    }

    public void setEstadoEnvase(EstadoEnvase estadoEnvase) {
        this.estadoEnvase = estadoEnvase;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public Float getCosto() {
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }

    public Boolean getComodatoGenerado() {
        return comodatoGenerado;
    }

    public void setComodatoGenerado(Boolean comodatoGenerado) {
        this.comodatoGenerado = comodatoGenerado;
    }
}
