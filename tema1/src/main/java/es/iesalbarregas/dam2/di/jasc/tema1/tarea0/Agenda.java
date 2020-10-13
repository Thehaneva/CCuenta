/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.iesalbarregas.dam2.di.jasc.tema1.tarea0;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jose Antonio
 */
public class Agenda {

    private final List<Contacto> lista;
    private int contador;
    
    public Agenda()
    {
        lista = new ArrayList();
    }
    
    public boolean isEmpy(){
        return getNumeroContactos()==0;
    }
    
    public boolean añadirContacto(Contacto nuevo) throws Exception{
       boolean añadir=false;
       if(buscarContactoPorTelefono(nuevo.getTelefono())==-1){
                añadir=lista.add(nuevo);
            } else throw new Exception("El contacto ya esta creado");
           return añadir;
    }
    
    public boolean modificarContacto(Contacto viejo) throws Exception{
        boolean modificar = false;
        Scanner sc = new Scanner(System.in);
            if(buscarContactoPorTelefono(viejo.getTelefono())!=-1){
                viejo.setNombre(validarNombre());
                viejo.setApellidos(validarApellidos());
                viejo.setTelefono(validarTelefono());
            modificar=true;
            }
            else throw new Exception("No se ha encontrado el Contacto");
            return modificar;
    }
    
    public boolean eliminarContacto(String telefono) throws Exception{
        boolean baja=false;
            if(buscarContactoPorTelefono(telefono)!=-1){
                lista.remove(buscarContactoPorTelefono(telefono));
                baja=true;
            }else throw new Exception("No se puede borrar");
            
        return baja;
    }
       
       public int buscarContactoPorNombre(String nombre) throws Exception {
       boolean encontrado=false;
        int i=0;
        int posicion=-1;
        if(!isEmpy()){
            while(!encontrado && i<getNumeroContactos()){
                if(lista.get(i).getNombre().equalsIgnoreCase(nombre)){
                    encontrado=true;
                    posicion=i;
                }   
                    else throw new Exception("No se ha encontrado la posicion del DNI");
                i++;
            }
       }
       return posicion;
       }
       
    public int buscarContactoPorTelefono(String telefono) throws Exception {
       boolean encontrado=false;
        int i=0;
        int posicion=-1;
        if(!isEmpy()){
            while(!encontrado && i<getNumeroContactos()){
                if(lista.get(i).getTelefono().equalsIgnoreCase(telefono)){
                    encontrado=true;
                    posicion=i;
                }   
                    else throw new Exception("No se ha encontrado la posicion del DNI");
                i++;
            }
       }
       return posicion;
       }
    
   public boolean existeContacto(String telefono) throws Exception {
       boolean encontrado=false;
        int i=0;
        if(!isEmpy()){
            while(!encontrado && i<getNumeroContactos()){
                if(lista.get(i).getTelefono().equalsIgnoreCase(telefono)){
                    encontrado=true;
                }   
                    else throw new Exception("No se ha encontrado el telefono");
                i++;
            }
       }
       return encontrado;
       }
    
   public boolean existeNombre(String nombre) throws Exception {
       boolean encontrado=false;
        int i=0;
        if(!isEmpy()){
            while(!encontrado && i<getNumeroContactos()){
                if(lista.get(i).getNombre().equalsIgnoreCase(nombre)){
                    encontrado=true;
                }   
                    else throw new Exception("No se ha encontrado el nombre");
                i++;
            }
       }
       return encontrado;
       }
    
    public int getNumeroContactos(){
        return lista.size();
    }
    
    public Contacto getContactoEnPosicion(int posicion){
        Contacto contacto=null;
        if(!isEmpy()){
            if(posicion>=0 && posicion<getNumeroContactos()){
                contacto=lista.get(posicion);
            }
        }
        return contacto;
    }
   
    
       
    public void obtenerContactos(){   
        for(Contacto listaContacto:lista){
            System.out.println(listaContacto.toString());
        }
    }
     public String validarNombre(){
        String nombre="";
        boolean comprobar=false;
        Pattern patron = Pattern.compile("[a-zA-Z_]+");
        Scanner sc = new Scanner(System.in);
        Matcher mat;
        while(comprobar==false){
            System.out.print("Introduce tu nombre :");
            nombre=sc.next();
            mat=patron.matcher(nombre);
                if(mat.matches()){
                    comprobar=true;
                    System.out.println("nombre Válido");
                } else{
                    System.out.println("Es incorrecto");
                    comprobar=false;
                }
        }
        return nombre;
    }
      public String validarApellidos(){
        String apellido="";
        boolean comprobar=false;
        Pattern patron = Pattern.compile("[a-zA-Z_]+");
        Scanner sc = new Scanner(System.in);
        Matcher mat;
        while(comprobar==false){
            System.out.print("Introduce tus apellidos :");
            apellido=sc.next();
            mat=patron.matcher(apellido);
                if(mat.matches()){
                    comprobar=true;
                    System.out.println("apellido Válido");
                } else{
                    System.out.println("Es incorrecto");
                    comprobar=false;
                }
        }
        return apellido;
    }
      public String validarTelefono(){
        String telefono="";
        boolean comprobar=false;
        Pattern patron = Pattern.compile("[0-9]{9}");
        Scanner sc = new Scanner(System.in);
        Matcher mat;
        while(comprobar==false){
            System.out.print("Introduce el Telefono:");
            telefono=sc.next();
            mat=patron.matcher(telefono);
                if(mat.matches()){
                    comprobar=true;
                    System.out.println("Telefono  Válido");
                } else{
                    System.out.println("Es incorrecto");
                    comprobar=false;
                }
        }
        return telefono;
    }
}
