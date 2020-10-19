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
        double cantidad1=0.0;
        double cantidad2=0.0;
        double cantidad3=0.0;
         
        double precio1=0.0;
        double precio2=0.0;
        double precio3=0.0;
        
        String total1 = "";
        String total2 = "";
        String total3 = "";
        
         for(int i = 0; i <= lista.size() - 1; i++){
            if(lista.get(i).getMedida().equalsIgnoreCase("Unidad")){
                cantidad1=cantidad1+lista.get(i).getCantidad();
                precio1=precio1+lista.get(i).getPrecioUnitario();
               total1="Unidad:"+"\n"+"Cantidad de productos:"+cantidad1+"\n"+"Precio Total"+precio1+"\n"+"----------------------------";
            } else if(lista.get(i).getMedida().equalsIgnoreCase("Kilos")){
                cantidad2=cantidad2+lista.get(i).getCantidad();
                precio2=precio2+lista.get(i).getPrecioUnitario();
                total2="Kilos:"+"\n"+"Cantidad de productos:"+cantidad2+"\n"+"Precio Total"+precio2+"\n"+"----------------------------";
            } else if(lista.get(i).getMedida().equalsIgnoreCase("Litros")){
                cantidad3=cantidad3+lista.get(i).getCantidad();
                precio3=precio3+lista.get(i).getPrecioUnitario();
                total3="Kilos:"+"\n"+"Cantidad de productos:"+cantidad3+"\n"+"Precio Total"+precio3+"\n"+"----------------------------";
            }
        }
        return total1 + total2 + total3;
    }
   
    public void mostrar(){
       
        for(Productos listaProdcuto:lista){
            System.out.println(listaProdcuto.toString());
        }
    }
}
