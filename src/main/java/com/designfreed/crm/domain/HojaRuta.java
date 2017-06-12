package com.designfreed.crm.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "HojasRuta")
public class HojaRuta {
    @Id
    @GeneratedValue
    @Column(name = "HojaRutaID")
    private Long id;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ChoferID")
    private Chofer chofer;

    @Column(name = "Estado")
    private Boolean estado;

    @Column(name = "ControlStock")
    private Boolean controlStock;

    @Column(name = "CierreMobile")
    private Boolean cierreMobile;

    public HojaRuta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public Boolean getControlStock() {
        return controlStock;
    }

    public void setControlStock(Boolean controlStock) {
        this.controlStock = controlStock;
    }

    public Boolean getCierreMobile() {
        return cierreMobile;
    }

    public void setCierreMobile(Boolean cierreMobile) {
        this.cierreMobile = cierreMobile;
    }
}
