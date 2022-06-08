/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public class Rombo implements Figura{

    public int altura;
    public int D;
    public int d;
    public int resultadoArea;
    public int resultadoPerimetro;

    public Rombo(int altura, int D, int d, int resultadoArea, int resultadoPerimetro) {
        this.altura = altura;
        this.D = D;
        this.d = d;
        this.resultadoArea = resultadoArea;
        this.resultadoPerimetro = resultadoPerimetro;
    }

 
   public void CalcularPerimetro() {
        resultadoPerimetro = 4*altura;
        System.out.println("El perimetro del rombo es: "+resultadoPerimetro);
    }

   
    public void CalcularArea() {
        resultadoArea = (D*d)/2;
        System.out.println("El area del rombo es: "+resultadoArea);
    }
    
    
}
