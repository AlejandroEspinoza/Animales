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
public class Orangutan extends Primate {
    public Orangutan(){
        super( "Orangutan ");
    }

    @Override
    public void correr(int metros) {
        System.out.println("Orangutan corriendo " + metros + "metros");
    }
}
