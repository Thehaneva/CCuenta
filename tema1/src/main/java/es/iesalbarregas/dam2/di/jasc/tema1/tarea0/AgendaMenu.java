/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalbarregas.dam2.di.jasc.tema1.tarea0;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Jose Antonio
 */
public class AgendaMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
       int opcion = 0;
        Agenda miAgenda = new Agenda();
        
      
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");

        do {
            System.out.println("MENU:");
            System.out.println("1-Crear Cliente");
            System.out.println("2-Mostrar numero de contactos");
            System.out.println("3-Borrar contacto");
            System.out.println("4-Modificar un contacto");
            System.out.println("0-Salir");
            try {
                System.out.println("Introduce una opcion:");
                opcion = sc.nextInt();
                if (opcion >= 0) {
                    switch (opcion) {
                        case 0:
                            System.out.println("Has salido de la aplicaión");
                            break;
                        case 1:
                            crearContacto(miAgenda);
                            break;
                        case 2:
                            System.out.println("Se va a mostrar el numero de contactos de la agenda"+miAgenda.getNumeroContactos());
                            break;
                        case 3:
                            borrarContacto(miAgenda);
                            break;
                        case 4:
                            modificarContacto(miAgenda);
                        default:
                    }
                } else {
                    System.out.println("Solo numeros positivos");
                }
            } catch (InputMismatchException e) {
                System.out.println("Introduce un número por favor, reinicie la aplicación");
            }
        } while (opcion != 0);
    }
    
    public static void modificarContacto(Agenda miAgenda) throws Exception{
        Contacto contacto;
        String telefono;
        telefono=miAgenda.validarTelefono();
        if(miAgenda.buscarContactoPorTelefono(telefono)!=-1){
            String nombre1=miAgenda.validarNombre();
            String apellidos1=miAgenda.validarApellidos();
            String telefono1=miAgenda.validarTelefono();
            contacto = new Contacto(nombre1,apellidos1,telefono1);
            miAgenda.modificarContacto(contacto);
        }   
    }
    public static void borrarContacto(Agenda miAgenda) throws Exception {
        Contacto contacto;
        String telefono;
        telefono=miAgenda.validarTelefono();
            if(miAgenda.buscarContactoPorTelefono(telefono)!=-1){
            contacto=miAgenda.getContactoEnPosicion(miAgenda.buscarContactoPorTelefono(telefono));
            miAgenda.eliminarContacto(telefono);
            }
    }
    
    public static void mostrarNumerosContactos(Agenda miAgenda) throws Exception {
        miAgenda.getNumeroContactos();
    }
    public static void crearContacto(Agenda miAgenda) throws Exception {
        String nombre;
        String apellidos;
        String telefono;

        nombre = miAgenda.validarNombre();
        apellidos = miAgenda.validarApellidos();
        telefono = miAgenda.validarTelefono();
            Contacto contacto = new Contacto(nombre, apellidos, telefono);
            miAgenda.añadirContacto(contacto);
        }
    }

