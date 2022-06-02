/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r5u3;

/**
 *
 * @author CALIDAD
 */
public class Maestro extends Persona{
    Maestro(int id, String nombre, String apellido, String correo){    
    super(id, nombre, apellido, correo);
    }

    @Override
    public void imprimirPerfil(){ 
  System.out.println("id Mestro: "+ this.getId() + "\n" + 
            "nombre: " + this.nombre + "\n" +
            "apellido: " + this.apellido + "\n"+ 
            "correo: " + this.correo);
    }
}
