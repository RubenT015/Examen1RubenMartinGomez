package com.example.alumnom.examen1rubenmartingomez;

import java.io.Serializable;

/**
 * Created by alumnom on 12/12/2017.
 */

public class Producto implements Serializable{
    int idProducto,imagen;
    String nombreProducto, descripcion;
    double precio;
    int galeriaImagenes[];

    public Producto(int idProducto, String nombreProducto, int imagen, double precio, String descripcion, int[] galeriaImagenes) {
        this.idProducto = idProducto;
        this.imagen = imagen;
        this.nombreProducto = nombreProducto;
        this.descripcion = descripcion;
        this.precio = precio;
        this.galeriaImagenes = galeriaImagenes;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int[] getGaleriaImagenes() {
        return galeriaImagenes;
    }

    public void setGaleriaImagenes(int[] galeriaImagenes) {
        this.galeriaImagenes = galeriaImagenes;
    }
}
