package com.lessons.java;

/**
 *
 * @author Alejandro
 */
public abstract class Primate extends Animales implements Trepar {

    public Primate( String primate ){
        super( "Primate" );
        System.out.println("Creando primate " + primate );
    }

    @Override
    public void trepaArbol(int metros) {
        System.out.println("Trepando " + metros + " metros" + " y esta vivo " + respira );
    }

    public abstract void correr( int metros );
}