package org.example.entities;

public class Bebida {
    boolean alcoolico;
    String volume;

    public Bebida(boolean alcoolico, String volume){
        this.alcoolico = alcoolico;
        this.volume = volume;
    }

    public Bebida(){}

    @Override
    public String toString() {
        return " Alcoolico: "+ alcoolico + " Volume: "+ volume+"ml ";
    }
}
