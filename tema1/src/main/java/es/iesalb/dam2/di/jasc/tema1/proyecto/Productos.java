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
    
}
