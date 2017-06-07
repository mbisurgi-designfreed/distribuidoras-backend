package com.designfreed.domain;

import com.sun.org.apache.xpath.internal.operations.Bool;
import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "MovimientosEnc")
public class Movimiento {
    @Id
    @GeneratedValue
    @Column(name = "MovimientoEncID")
    private Long id;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne()
    @JoinColumn(name = "ClienteID")
    private Cliente cliente;

    @OneToOne
    @JoinColumn(name = "CondicionVentaID")
    private CondicionVenta condicionVenta;

    @OneToOne
    @JoinColumn(name = "TipoMovimientoID")
    private TipoMovimiento tipoMovimiento;

    @OneToOne
    @JoinColumn(name = "EstadoMovimientoID")
    private EstadoMovimiento estadoMovimiento;

    @ManyToOne()
    @JoinColumn(name = "HojaRutaID")
    private HojaRuta hojaRuta;

    @Column(name = "Visito")
    private Boolean visito;

    @Column(name = "Vendio")
    private Boolean vendio;

    @OneToOne
    @JoinColumn(name = "MotivoID")
    private Motivo motivo;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "MovimientoEncID", referencedColumnName = "MovimientoEncID" ,nullable = false)
    private List<ItemMovimiento> items = new ArrayList<>();

    @Column(name = "Reclamo")
    private Boolean reclamo;

    @Column(name = "Observaciones")
    private String observaciones;

    @Column(name = "Sincronizado")
    private Boolean sincronizado;

    public Movimiento() {
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

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public CondicionVenta getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(CondicionVenta condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public TipoMovimiento getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(TipoMovimiento tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public EstadoMovimiento getEstadoMovimiento() {
        return estadoMovimiento;
    }

    public void setEstadoMovimiento(EstadoMovimiento estadoMovimiento) {
        this.estadoMovimiento = estadoMovimiento;
    }

    public HojaRuta getHojaRuta() {
        return hojaRuta;
    }

    public void setHojaRuta(HojaRuta hojaRuta) {
        this.hojaRuta = hojaRuta;
    }

    public Boolean getVisito() {
        return visito;
    }

    public void setVisito(Boolean visito) {
        this.visito = visito;
    }

    public Boolean getVendio() {
        return vendio;
    }

    public void setVendio(Boolean vendio) {
        this.vendio = vendio;
    }

    public Motivo getMotivo() {
        return motivo;
    }

    public void setMotivo(Motivo motivo) {
        this.motivo = motivo;
    }

    public List<ItemMovimiento> getItems() {
        return items;
    }

    public void setItems(List<ItemMovimiento> items) {
        this.items = items;
    }

    public Boolean getReclamo() {
        return reclamo;
    }

    public void setReclamo(Boolean reclamo) {
        this.reclamo = reclamo;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Boolean getSincronizado() {
        return sincronizado;
    }

    public void setSincronizado(Boolean sincronizado) {
        this.sincronizado = sincronizado;
    }
}
