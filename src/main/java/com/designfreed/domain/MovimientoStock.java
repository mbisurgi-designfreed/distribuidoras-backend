package com.designfreed.domain;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MovimientosStockEnc")
public class MovimientoStock {
    @Id
    @GeneratedValue
    @Column(name = "MovimientoStockEncID")
    private Long id;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne()
    @JoinColumn(name = "HojaRutaID")
    private HojaRuta hojaRuta;

    @Column(name = "TipoMovimiento")
    private String tipoMovimiento;

    @Column(name = "Modulo")
    private String modulo;

    @Column(name = "NroComprobante")
    private String nroComprobante;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "MovimientoStockEncID", referencedColumnName = "MovimientoStockEncID" ,nullable = false)
    private List<ItemMovimientoStock> items = new ArrayList<>();

    public MovimientoStock() {
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

    public HojaRuta getHojaRuta() {
        return hojaRuta;
    }

    public void setHojaRuta(HojaRuta hojaRuta) {
        this.hojaRuta = hojaRuta;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public String getModulo() {
        return modulo;
    }

    public void setModulo(String modulo) {
        this.modulo = modulo;
    }

    public String getNroComprobante() {
        return nroComprobante;
    }

    public void setNroComprobante(String nroComprobante) {
        this.nroComprobante = nroComprobante;
    }

    public List<ItemMovimientoStock> getItems() {
        return items;
    }

    public void setItems(List<ItemMovimientoStock> items) {
        this.items = items;
    }
}
