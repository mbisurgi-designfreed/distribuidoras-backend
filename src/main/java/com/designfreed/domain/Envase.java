package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "Envases")
public class Envase {
    @Id
    @GeneratedValue
    @Column(name = "EnvaseID")
    private Long id;

    @Column(name = "EnvaseCodigo")
    private Integer envaseCodigo;

    @Column(name = "EnvaseNombre")
    private String envaseNombre;

    @Column(name = "Kilos")
    private Float kilos;

    public Envase() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getEnvaseCodigo() {
        return envaseCodigo;
    }

    public void setEnvaseCodigo(Integer envaseCodigo) {
        this.envaseCodigo = envaseCodigo;
    }

    public String getEnvaseNombre() {
        return envaseNombre;
    }

    public void setEnvaseNombre(String envaseNombre) {
        this.envaseNombre = envaseNombre;
    }

    public Float getKilos() {
        return kilos;
    }

    public void setKilos(Float kilos) {
        this.kilos = kilos;
    }
}
