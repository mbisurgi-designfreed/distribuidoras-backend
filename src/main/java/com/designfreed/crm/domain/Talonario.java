package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "Talonarios")
public class Talonario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "TalonarioID")
    private Long id;

    @Column(name = "TalonarioNombre")
    private String talonarioNombre;

    @Column(name = "NumeroDesde")
    private Integer numeroDesde;

    @Column(name = "NumeroHasta")
    private Integer numeroHasta;

    @Column(name = "NumeroProximo")
    private Integer numeroProximo;

    @Column(name = "Estado")
    private Boolean estado;

    public Talonario() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTalonarioNombre() {
        return talonarioNombre;
    }

    public void setTalonarioNombre(String talonarioNombre) {
        this.talonarioNombre = talonarioNombre;
    }

    public Integer getNumeroDesde() {
        return numeroDesde;
    }

    public void setNumeroDesde(Integer numeroDesde) {
        this.numeroDesde = numeroDesde;
    }

    public Integer getNumeroHasta() {
        return numeroHasta;
    }

    public void setNumeroHasta(Integer numeroHasta) {
        this.numeroHasta = numeroHasta;
    }

    public Integer getNumeroProximo() {
        return numeroProximo;
    }

    public void setNumeroProximo(Integer numeroProximo) {
        this.numeroProximo = numeroProximo;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
}
