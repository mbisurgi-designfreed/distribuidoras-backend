package com.designfreed.domain;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "ListasPrecio")
public class ListaPrecio {
    @Id
    @GeneratedValue
    @Column(name = "ListaPrecioID")
    private Long id;

    @Column(name = "ListaPrecioNombre")
    private String listaPrecioNombre;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER, orphanRemoval = true)
    @LazyCollection(LazyCollectionOption.FALSE)
    @JoinColumn(name = "ListaPrecioID", referencedColumnName = "ListaPrecioID" ,nullable = false)
    private List<ItemListaPrecio> items = new ArrayList<>();

    public ListaPrecio() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getListaPrecioNombre() {
        return listaPrecioNombre;
    }

    public void setListaPrecioNombre(String listaPrecioNombre) {
        this.listaPrecioNombre = listaPrecioNombre;
    }

    public List<ItemListaPrecio> getItems() {
        return items;
    }

    public void setItems(List<ItemListaPrecio> items) {
        this.items = items;
    }
}
