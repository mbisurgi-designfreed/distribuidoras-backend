package com.designfreed.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "CargasEnc")
public class Carga {
    @Id
    @GeneratedValue
    @Column(name = "CargaEncID")
    private Long id;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne()
    @JoinColumn(name = "CargaTipoID")
    private TipoCarga tipo;

    @ManyToOne()
    @JoinColumn(name = "HojaRutaID")
    private HojaRuta hojaRuta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "CargaEncID", referencedColumnName = "CargaEncID" ,nullable = false)
    private List<ItemCarga> items = new ArrayList<>();

    public Carga() {
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

    public TipoCarga getTipo() {
        return tipo;
    }

    public void setTipo(TipoCarga tipo) {
        this.tipo = tipo;
    }

    public HojaRuta getHojaRuta() {
        return hojaRuta;
    }

    public void setHojaRuta(HojaRuta hojaRuta) {
        this.hojaRuta = hojaRuta;
    }

    public List<ItemCarga> getItems() {
        return items;
    }

    public void setItems(List<ItemCarga> items) {
        this.items = items;
    }
}
