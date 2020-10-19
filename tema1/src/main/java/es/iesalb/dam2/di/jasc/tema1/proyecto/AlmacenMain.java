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
public class AlmacenMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        
        //Creamos un almacen
        Almacen almacen = new Almacen();
        
        //Insertamos alguno productos en el almacen
        Productos producto1 = new Productos("111111111","Patata","Son amarillas",4.5,2,"Kilos");
        Productos producto2 = new Productos("222222222","Agua","Es muy buena",0.52,1.5,"Kilos");
        Productos producto3 = new Productos("333333333","Telefonos","Son de China",149.99,1,"Kilos");
        almacen.add(producto1);
        almacen.add(producto2);
        almacen.add(producto3);
        // Crea la ventana
        AlmacenMainWindow window = new AlmacenMainWindow(almacen);
        window.setVisible(true);
    }
    
}
