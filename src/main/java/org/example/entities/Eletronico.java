package org.example.entities;

public class Eletronico {
    String modelo;

    public Eletronico(String modelo){
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return " Modelo: "+ modelo;
    }
}
