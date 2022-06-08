/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public class Rectangulo implements Figura{
    public int base;
    public int altura;
    public int resultadoArea;
    public int resultadoPerimetro;
    

    public Rectangulo(int base, int altura, int resultadoArea, int resultadoPerimetro) {
        this.base = base;
        this.altura = altura;
        this.resultadoArea = resultadoArea;
        this.resultadoPerimetro = resultadoPerimetro;
    }
}
