/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public class Paralelogramo implements Figura{
    public int base;
    public int altura;
    public int resultadoArea;
    public int resultadoPerimetro;

    public Paralelogramo(int base, int altura, int resultadoArea, int resultadoPerimetro) {
        this.base = base;
        this.altura = altura;
        this.resultadoArea = resultadoArea;
        this.resultadoPerimetro = resultadoPerimetro;
    }
}
