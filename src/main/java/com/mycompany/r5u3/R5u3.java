/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.r5u3;

/**
 *
 * @author Gustavo Zúñiga
 */
public class R5u3 {

    public static void main(String[] args) {
        System.out.println("Creando alumno, tutor y maestro... ");
        Maestro m1 = new Maestro(1, "Francisco", "Perea", "fperea@uveg.com");
        Alumno a1 = new Alumno(2, "Eduardo", "Rodriguez","reduardo@uveg.com");
       System.out.println("guardando calificación");
        a1.guardarCalificacion(7.50);
        Tutor t1 = new Tutor(3,"Jaime", "Alonso", "ajaime@uveg.com",a1);
        m1.imprimirPerfil();
        a1.imprimirPerfil();
        a1.mostrarCalificaciones();
        t1.imprimirPerfil();
        t1.alumno.imprimirPerfil();
        t1.mostrarCalificaciones();
                
    }
}
