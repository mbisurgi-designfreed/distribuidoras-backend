package com.designfreed.crm.domain;

import javax.persistence.*;

@Entity
@Table(name = "Plantillas")
public class Plantilla {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "PlantillaID")
    private Long id;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ClienteID")
    private Cliente cliente;

    @Column(name = "DiaSemana")
    private String diaSemana;

    public Plantilla() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getDiaSemana() {
        return diaSemana;
    }

    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }
}
