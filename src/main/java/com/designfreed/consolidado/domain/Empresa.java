package com.designfreed.consolidado.domain;

import javax.persistence.*;

@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private Long id;

    @Column(name = "empresa")
    private String empresa;

    public Empresa() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
}
