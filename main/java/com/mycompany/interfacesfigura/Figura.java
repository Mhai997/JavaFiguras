/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public interface Figura {
    public static final  int base =0;
    public static final  int altura =0;
    public static final  int resultadoArea = 0;
    public static final  int resultadoPerimetro = 0;
    public static final int D=0;
    public static final int d=0;
    //default void CalcularPerimetro(){
        //int resultadoPerimetro = lado1+lado2+lado3+lado4;
        //System.out.println("El perimetro es: "+resultadoPerimetro);
    //}
    default void CalcularPerimetro(int base, int altura){
        int resultadoPerimetro = 2*(base+altura);
        System.out.println("El perimetro es: "+resultadoPerimetro);
    };
    default void CalcularArea(int base, int altura){
        int resultadoArea =base * altura;
        System.out.println("El area es: "+resultadoArea);

    };
    default void InformacionFigura(){
        System.out.println("Son figuras de 4 lados");
    }
    
    
}
