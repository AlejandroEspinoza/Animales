package com.lessons.java;

public abstract class Animales {
    public static boolean terricola;
    private boolean vive;
    protected boolean respira;
    public boolean seMueve;
    boolean camina;

    public Animales ( String tipo ){
        System.out.println("Creando animal " + tipo + " y esta vivo " + vive );
    }
    
    public static void main(String[] args) {
        // Animales animales = new Animales();
        // Primate primate = new Primate();
        Mono mono = new Mono();
        mono.trepaArbol(10);
        
        Orangutan orangutan = new Orangutan();
        orangutan.trepaArbol(5);
        
        orangutan.correr(100);
    }
}
