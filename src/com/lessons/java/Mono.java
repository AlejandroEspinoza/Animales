/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lessons.java;

/**
 *
 * @author Alejandro
 */
public class Mono extends Primate {
    public Mono(){
        super( "Mono ");
        System.out.println("Creando Mono");
    }

    @Override
    public void correr(int metros) {
        System.out.println("Mono corriendo " + metros + "metros");
    }
}
