/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalbarregas.dam2.di.jasc.tema1.tarea0;

import java.util.Scanner;

/**
 *
 * @author Jose Antonio
 */
public class AgendaMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int opcion = 0;
        
        Agenda miListaDeContactos = new Agenda();
        boolean salir = false;
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        
        do{
            System.out.println("MENU:");
            System.out.println("1-Alta de Contactos");
            System.out.println("2-Baja de Contacto");
            System.out.println("3-Modificar Contacto");
            System.out.println("4-Mostrar Lista de Contactos");
            System.out.println("0-Salir");
            
                System.out.print("Introduce una opcion:");
                opcion = sc.nextInt();
                if(opcion >=0){
                    switch (opcion){
                        case 0:
                            System.out.println("Has salido del programa");
                            break;
                        case 1:
                            
                            break;
                        case 2:
                            
                    }
                }
        }
    }
        
        
    }
    
