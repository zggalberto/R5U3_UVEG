/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r5u3;

/**
 *
 * @author CALIDAD
 */
public class Alumno extends Persona implements ICalificaciones{
    private double calificacion;
    Alumno(int id, String nombre, String apellido, String correo){
    super(id, nombre, apellido, correo);
    }
   
    public void setCalificacion(double calificacion){
    this.calificacion = calificacion;         
    }
    
    public double getCalificacion(){
        return this.calificacion;
     }
    
    @Override
    public void mostrarCalificaciones() {
        System.out.println("calificación: " + this.getCalificacion());    
    }
    
    public void guardarCalificacion(double calificacion){
        this.setCalificacion(calificacion);
    }

  @Override
    public void imprimirPerfil(){ 
  System.out.println("id Alumno: "+ this.getId() + "\n" + 
            "nombre: " + this.nombre + "\n" +
            "apellido: " + this.apellido + "\n"+ 
            "correo: " + this.correo);
    }


}