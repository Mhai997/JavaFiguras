/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.interfacesfigura;

import java.util.Locale;

/**
 *
 * @author DaniMay
 */
public class InterfacesFigura {
    
    public static void main(String[] args)
    {
        
       
        Rectangulo r = new Rectangulo(10,20,0,0);
        Paralelogramo p = new Paralelogramo(10,20,0,0);
        Rombo ro = new Rombo(10,8,4,0,0);
        ClassFigura cf = new ClassFigura("RECTANGULO");
        ClassFigura cf2 = new ClassFigura(4);
        
        System.out.println("---------RECTANGULO---------");
        cf.nombreFigura();
        cf2.nombreFigura(4);
        r.CalcularArea(10,20);
        r.CalcularPerimetro(10,20);
        r.InformacionFigura();
        
        System.out.println("---------PARALELOGRAMO---------");
        p.CalcularArea(10,20);
        p.CalcularPerimetro(10,20);
        p.InformacionFigura();
    
        System.out.println("---------ROMBO---------");
        ro.CalcularArea();
        ro.CalcularPerimetro();
        ro.InformacionFigura();
    
    }
}
