/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalb.dam2.di.jasc.tema1.proyecto;

/**
 *
 * @author Jose Antonio
 */
public class Productos {
    private enum medida{Unidadades,Kilos,Litros}
    
    private long codigo;
    private String nombre;
    private String descripcion;
    private double precioUnitario;
    private medida cantidad;

    public Productos(long codigo, String nombre, String descripcion, double precioUnitario, medida cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public medida getCantidad() {
        return cantidad;
    }

    public void setCantidad(medida cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Productos{" + "codigo=" + codigo + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precioUnitario=" + precioUnitario + ", cantidad=" + cantidad + '}';
    }
    
    
}
