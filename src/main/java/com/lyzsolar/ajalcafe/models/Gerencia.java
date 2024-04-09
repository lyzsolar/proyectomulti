package com.lyzsolar.ajalcafe.models;

import java.time.LocalDate;
import java.util.ArrayList;

public class Gerencia {
    private Integer idProducto;
    private String nombreProducto;
    private String categoria;
    private LocalDate fechacaducidad;
    private Integer cantidadProducto;
    private String unidad;
    private double precioProducto;
    public Gerencia(Integer idProducto, String nombreProducto, String categoria, LocalDate fechacaducidad, Integer cantidadProducto, String unidad, double precioProducto) {
        this.idProducto = idProducto;
        this.nombreProducto = nombreProducto;
        this.categoria = categoria;
        this.fechacaducidad = fechacaducidad;
        this.cantidadProducto = cantidadProducto;
        this.unidad = unidad;
        this.precioProducto = precioProducto;
    }

    public Integer getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(LocalDate fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public Integer getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(Integer cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public static void setInsumos(ArrayList<Producto> insumos) {
        Gerencia.insumos = insumos;
    }


    public static ArrayList <Producto> insumos = new ArrayList<>();
    public static boolean addProducto(Producto p1){return insumos.add(p1);}
    public static ArrayList<Producto> getInsumos() {
        return insumos;
    }

}
