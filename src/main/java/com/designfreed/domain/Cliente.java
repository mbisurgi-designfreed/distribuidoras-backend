package com.designfreed.domain;

import javax.persistence.*;

@Entity
@Table(name = "Clientes")
public class Cliente {
    @Id
    @GeneratedValue
    @Column(name = "ClienteID")
    private Long id;

    @Column(name = "RazonSocial")
    private String razonSocial;

    @Column(name = "Calle")
    private String calle;

    @Column(name = "Altura")
    private String altura;

    @Column(name = "Telefono")
    private String telefono;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "CondicionVentaID")
    private CondicionVenta condicionVenta;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.PERSIST})
    @JoinColumn(name = "ListaPrecioID")
    private ListaPrecio listaPrecio;

    public Cliente() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public CondicionVenta getCondicionVenta() {
        return condicionVenta;
    }

    public void setCondicionVenta(CondicionVenta condicionVenta) {
        this.condicionVenta = condicionVenta;
    }

    public ListaPrecio getListaPrecio() {
        return listaPrecio;
    }

    public void setListaPrecio(ListaPrecio listaPrecio) {
        this.listaPrecio = listaPrecio;
    }
}
