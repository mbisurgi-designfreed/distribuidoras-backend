package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "CargasDet")
public class ItemCarga {
    @Id
    @GeneratedValue
    @Column(name = "CargaDetID")
    private Long id;

    @OneToOne
    @JoinColumn(name = "EnvaseID")
    private Envase envase;

    @Column(name = "Lleno")
    private Integer lleno;

    @Column(name = "Vacio")
    private Integer vacio;

    @Column(name = "Averiado")
    private Integer averiado;

    @Column(name = "Retiro")
    private Integer retiro;

    @Column(name = "Entrega")
    private Integer entrega;

    @Column(name = "Cambio")
    private Integer cambio;

    public ItemCarga() {
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

    public Integer getLleno() {
        return lleno;
    }

    public void setLleno(Integer lleno) {
        this.lleno = lleno;
    }

    public Integer getVacio() {
        return vacio;
    }

    public void setVacio(Integer vacio) {
        this.vacio = vacio;
    }

    public Integer getAveriado() {
        return averiado;
    }

    public void setAveriado(Integer averiado) {
        this.averiado = averiado;
    }

    public Integer getRetiro() {
        return retiro;
    }

    public void setRetiro(Integer retiro) {
        this.retiro = retiro;
    }

    public Integer getEntrega() {
        return entrega;
    }

    public void setEntrega(Integer entrega) {
        this.entrega = entrega;
    }

    public Integer getCambio() {
        return cambio;
    }

    public void setCambio(Integer cambio) {
        this.cambio = cambio;
    }
}
