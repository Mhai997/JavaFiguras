/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public class Cuadrado implements Figura{
    public int lado1;
    public int lado2;
    public int lado3;
    public int lado4;
    public int resultadoArea;
    public int resultadoPerimetro;
    

    public void CalcularPerimetro() {
        resultadoPerimetro = lado1+lado2+lado3+lado4;
        System.out.println("El perimetro del cuadrado es: "+resultadoPerimetro);
    }

   
 

    public void CalcularArea() {
        resultadoArea = lado1 * lado2;
        System.out.println("El area del cuadrado es: "+resultadoArea);    
    }

    
    
}
