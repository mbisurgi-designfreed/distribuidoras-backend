package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "CargasTipo")
public class TipoCarga {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CargaTipoID")
    private Long id;

    @Column(name = "TipoCargaNombre")
    private String tipoCargaNombre;

    @Column(name = "Sigla")
    private String sigla;

    public TipoCarga() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTipoCargaNombre() {
        return tipoCargaNombre;
    }

    public void setTipoCargaNombre(String tipoCargaNombre) {
        this.tipoCargaNombre = tipoCargaNombre;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
}
