package com.designfreed.crm.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "HojasRuta")
public class HojaRuta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "HojaRutaID")
    private Long id;

    @Column(name = "HojaRutaNumero")
    private String hojaRutaNumero;

    @Column(name = "Fecha")
    private Date fecha;

    @ManyToOne()
    @JoinColumn(name = "ZonaID")
    private Zona zona;

    @ManyToOne()
    @JoinColumn(name = "ChoferID")
    private Chofer chofer;

    @ManyToOne()
    @JoinColumn(name = "CamionID")
    private Camion camion;

    @Column(name = "KmInicial")
    private Integer kmInicial;

    @Column(name = "KmFinal")
    private Integer kmFinal;

    @Column(name = "VentaContado")
    private Float ventaContado;

    @Column(name = "VentaCtacte")
    private Float ventaCtacte;

    @Column(name = "VentaTarjeta")
    private Float ventaTarjeta;

    @Column(name = "GastoCombustible")
    private Float gastoCombustible;

    @Column(name = "GastoViatico")
    private Float gastoViatico;

    @Column(name = "GastoOtro")
    private Float gastoOtro;

    @Column(name = "Cobranza")
    private Float cobranza;

    @Column(name = "Cheques")
    private Float cheques;

    @Column(name = "Efectivo")
    private Float efectivo;

    @Column(name = "Estado")
    private Boolean estado;

    @Column(name = "ControlStock")
    private Boolean controlStock;

    @Column(name = "CierreMobile")
    private Boolean cierreMobile;

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
//    @JoinColumn(name = "HojaRutaID", referencedColumnName = "HojaRutaID" ,nullable = false)
//    private List<Movimiento> movimientos = new ArrayList<>();

    public HojaRuta() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHojaRutaNumero() {
        return hojaRutaNumero;
    }

    public void setHojaRutaNumero(String hojaRutaNumero) {
        this.hojaRutaNumero = hojaRutaNumero;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }

    public Chofer getChofer() {
        return chofer;
    }

    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

    public Camion getCamion() {
        return camion;
    }

    public void setCamion(Camion camion) {
        this.camion = camion;
    }

    public Integer getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(Integer kmInicial) {
        this.kmInicial = kmInicial;
    }

    public Integer getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(Integer kmFinal) {
        this.kmFinal = kmFinal;
    }

    public Float getVentaContado() {
        return ventaContado;
    }

    public void setVentaContado(Float ventaContado) {
        this.ventaContado = ventaContado;
    }

    public Float getVentaCtacte() {
        return ventaCtacte;
    }

    public void setVentaCtacte(Float ventaCtacte) {
        this.ventaCtacte = ventaCtacte;
    }

    public Float getVentaTarjeta() {
        return ventaTarjeta;
    }

    public void setVentaTarjeta(Float ventaTarjeta) {
        this.ventaTarjeta = ventaTarjeta;
    }

    public Float getGastoCombustible() {
        return gastoCombustible;
    }

    public void setGastoCombustible(Float gastoCombustible) {
        this.gastoCombustible = gastoCombustible;
    }

    public Float getGastoViatico() {
        return gastoViatico;
    }

    public void setGastoViatico(Float gastoViatico) {
        this.gastoViatico = gastoViatico;
    }

    public Float getGastoOtro() {
        return gastoOtro;
    }

    public void setGastoOtro(Float gastoOtro) {
        this.gastoOtro = gastoOtro;
    }

    public Float getCobranza() {
        return cobranza;
    }

    public void setCobranza(Float cobranza) {
        this.cobranza = cobranza;
    }

    public Float getCheques() {
        return cheques;
    }

    public void setCheques(Float cheques) {
        this.cheques = cheques;
    }

    public Float getEfectivo() {
        return efectivo;
    }

    public void setEfectivo(Float efectivo) {
        this.efectivo = efectivo;
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

//    public List<Movimiento> getMovimientos() {
//        return movimientos;
//    }
//
//    public void setMovimientos(List<Movimiento> movimientos) {
//        this.movimientos = movimientos;
//    }
}
