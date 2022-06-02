/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r5u3;

/**
 *
 * @author CALIDAD
 */
public class Tutor extends Persona implements ICalificaciones{
    Alumno alumno;
    Tutor(int id, String nombre, String apellido, String correo, Alumno alumno){
    super(id, nombre, apellido, correo);
    this.alumno = alumno;
    }
    
    @Override
    public void mostrarCalificaciones(){
        this.alumno.mostrarCalificaciones();
    }
    
      @Override
    public void imprimirPerfil(){ 
  System.out.println("id Tutor: "+ this.getId() + "\n" + 
            "nombre: " + this.nombre + "\n" +
            "apellido: " + this.apellido + "\n"+ 
            "correo: " + this.correo);
    }
    
}
