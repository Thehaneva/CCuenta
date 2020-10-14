/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalbarregas.dam2.di.jasc.tema1.ejercicios.ventanas;

/**
 *
 * @author Jose Antonio
 */
public class Ejercicio6MainExitOnClose {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ejercicio6JFrameExitOnClose mi2JFrame = new Ejercicio6JFrameExitOnClose();
         Ejercicio6JFrameExitOnClose mi3JFrame = new Ejercicio6JFrameExitOnClose();
         
         mi2JFrame.setTitle("Titulo 2");
         mi2JFrame.setVisible(true);
         
          mi3JFrame.setTitle("Titulo 3");
         mi3JFrame.setVisible(true);
    }
    
}
