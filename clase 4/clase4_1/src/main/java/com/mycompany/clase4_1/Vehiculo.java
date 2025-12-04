package com.mycompany.clase4_1;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author usuario
 */
public class Vehiculo {
    //un atributo privado solo se puede usar
    //directamente en la misma clase. Ese el
    //concepto de "ocultamiento"
    private String placa;
    private int año;
    private float precio;
     
    //el constructor de la clase se ejecuta automaticamente
    //al instanciar la clase
    Vehiculo(){
        placa = "";
        año = 2000;
        precio = 1000;
    }
    
    double calcularDescuento(){
    if  (getAño()>2015)
        return precio*0.10;
    else
        return 0;
    }
    
    float getPrecio(){
        return precio;
    }
         
    void setPrecio(float pr){
        precio = pr;
    }
    
    //getter atributo placa
    String getPlaca(){
        return placa;
    }
    //setter atributo placa
    void setPlaca(String p){
        placa = p;
    }
    //getter atributo año
    int getAño(){
        return año;
    }
    //setter atributo año
    void setAño(int a){
        año = a;
    }
}
