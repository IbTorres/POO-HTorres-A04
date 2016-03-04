/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package p00.htorres.a03;

/**
 *
 * @author Alison Torres
 */
public class Contacto {  //que guarde nombre, teléfono y correo como atributos privados
//atributos        
    private String nombre;
    private String telefono;
    private String email;
    
    //Métodos
    /**
     * Constructor
     * @param nombre Es el nombre del contacto
     * @param telefono El número del contacto
     * @param email Es el email del contacto
     */
    public Contacto(String nombre, String telefono, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
    }
    /**
     * Método que imprime los datos del conacto
     *
     */
    public void getContacto(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Teléfono: " + this.telefono);
        System.out.println("Email: " + this.email);
        

    }

      /*public String getContacto(String nombre, String telefono, String email){
       this.nombre = nombre;
       this.telefono = telefono;
       this.email = email; */
       
    }
   
    
  
    