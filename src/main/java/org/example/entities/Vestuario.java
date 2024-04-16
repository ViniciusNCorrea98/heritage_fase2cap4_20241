package org.example.entities;

public class Vestuario {
    String tamanho;
    String cor;
    String material;

    public Vestuario(String tamanho, String cor, String material){
        this.tamanho = tamanho;
        this.cor = cor;
        this.material = material;
    }

    public Vestuario(){}

    @Override
    public String toString() {
        return " Tamanho: "+ tamanho + " Cor: "+ cor + " Material: "+ material;
    }
}
