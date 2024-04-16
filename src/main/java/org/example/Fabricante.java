package org.example;

public class Fabricante {

    String nome;
    String endereco;
    String telefone;

    public Fabricante(){}

    public Fabricante(String nome, String endereco, String telefone){
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return " Nome do fabricante: " + nome + ", Endereço do fabricante: " + endereco + " Telefone do fabricante: " + telefone;
    }
}
