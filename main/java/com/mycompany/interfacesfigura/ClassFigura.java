/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

/**
 *
 * @author DaniMay
 */
public class ClassFigura {
    
    public String nombreFig;
    public int lados;


    public ClassFigura(String nombreFig) {
        this.nombreFig = nombreFig;
    }

    public ClassFigura(int lados) {
        this.lados = lados;
    }

    public void nombreFigura(){
        System.out.println("El nombre de la figura es: "+nombreFig);
    }
    
    public void nombreFigura(int lados){
        System.out.println("Tiene: "+lados+" lados");
    }

}
