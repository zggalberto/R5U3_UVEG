/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.r5u3;

/**
 *
 * @author Gustavo Zúñiga 
 */
public abstract class Persona{
    private int id;
    String nombre;
    String apellido;
    String correo;
    
    Persona(int id, String nombre, String apellido, String correo){
    this.id = id;
    this.nombre = nombre;
    this.apellido = apellido;
    this.correo = correo;
    }
    
    public int getId(){
    return this.id;
    }
    
    public abstract void imprimirPerfil();
    
}
