/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalb.dam2.di.jasc.tema1.proyecto;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Jose Antonio
 */
public class Almacen {
    
    private List<Productos> lista;
            
    public Almacen(){
        lista= new ArrayList();
    }
    
    public int isLenght(){
        return lista.size();
    }
    
    public boolean isEmpy(){
        return isLenght()==0;
    }
    
      public Productos posicion(int posicion){
        Productos producto=null;
        if(!isEmpy()){
            if(posicion>=0 && posicion<isLenght()){
                producto=lista.get(posicion);
            }
        }
        return producto;
    }
      
       public int buscar(String codigo)  {
       boolean encontrado=false;
        int i=0;
        int posicion=-1;
        if(!isEmpy()){
            while(!encontrado && i<isLenght()){
                if(lista.get(i).getCodigo().equalsIgnoreCase(codigo)){
                    encontrado=true;
                    posicion=i;
                }   
                    else ;
                i++;
            }
       }
       return posicion;
       }
       
      public boolean borrar(String codigo) throws Exception{
        boolean baja=false;
            if(buscar(codigo)!=-1){
                lista.remove(buscar(codigo));
                baja=true;
            }else throw new Exception("No se puede borrar");
            
        return baja;
    }
      public boolean borrarPorPosicion(int posicion) throws Exception{
        boolean baja=false;
             if(!isEmpy()){
            if(posicion>=0 && posicion<isLenght()){
               lista.remove(posicion);
            }
            }else throw new Exception("No se puede borrar");
            
        return baja;
    }
    
   public boolean add(Productos Producto) throws Exception{
       boolean añadir=false;
       if(buscar(Producto.getCodigo())==-1){
                añadir=lista.add(Producto);
            } else throw new Exception("El Producto ya esta creado");
           return añadir;
    }

   public String obtenerImportes(){
        
        int unidades = 0;
        int kilos = 0;
        int litros = 0;
        double importeU = 0;
        double importeK = 0;
        double importeL = 0;
        
        String importe3="";
        String importe2="";
        String importe1="";
        for(Productos miProducto: lista){
            
            if(miProducto.getMedida().equalsIgnoreCase("Unidad")){
                importeU = importeU + (miProducto.getPrecioUnitario() + miProducto.getCantidad()) ;
                unidades++;
            }else if(miProducto.getMedida().equalsIgnoreCase("Kilos")){
                importeK = importeK + (miProducto.getPrecioUnitario() * miProducto.getCantidad());
                kilos++;
            }else if(miProducto.getMedida().equalsIgnoreCase("Litros")){
                importeL = importeL + (miProducto.getPrecioUnitario() * miProducto.getCantidad());
                litros++;
            }
            
        }
        
         importe1 = "Tienes: " + unidades +"\n"+ " Producto/s en unidades que se traducen en " + importeU + " euros.\n";
         importe2 = "Tienes: " + kilos  +"\n"+" Producto/s en kilos que se traducen en " + importeK + " euros.\n";
         importe3 = "Tienes: " + litros +"\n"+" Producto/s en litros que se traducen en " + importeL + " euros.\n";
        
        return importe1 +"\n"+importe2+"\n"+importe3;
        
    };
   
    public void mostrar(){
       
        for(Productos listaProdcuto:lista){
            System.out.println(listaProdcuto.toString());
        }
    }
}
