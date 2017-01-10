package com.designfreed.domain;

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
    @JoinColumn(name = "EstadoMovimientoID")
    private EstadoMovimiento estadoMovimiento;

    @ManyToOne()
    @JoinColumn(name = "HojaRutaID")
    private HojaRuta hojaRuta;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @JoinColumn(name = "MovimientoEncID", referencedColumnName = "MovimientoEncID" ,nullable = false)
    private List<ItemMovimiento> items = new ArrayList<>();

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

    public List<ItemMovimiento> getItems() {
        return items;
    }

    public void setItems(List<ItemMovimiento> items) {
        this.items = items;
    }
}
