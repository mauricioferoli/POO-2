/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4_1;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Clase4_1 {

    public static void main(String[] args) {
        Vehiculo x=new Vehiculo();
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduzca la placa del vehiculo ");
        //teclado.next se utiliza para leer un valor string
        //por el teclado
        x.setPlaca(teclado.next());
        
        System.out.println("Introduzca el año del vehiculo ");
        //teclado.nextInt para leer un valor int por el teclado
        x.setAño(teclado.nextInt());
      
        System.out.println("La placa de mi vehiculo es "+x.getPlaca/**+"y es del año "+x.getAño**/());
        System.out.println("El año es "+x.getAño());
        
        if (x.getAño()>2015)
            double montoDeDescuento = x.calcularDescuento();
            System.out.println("Le toca un descuento del 10%");
            System.out.println("Que son "+montoDeDescuento()+"$");
    }
}
