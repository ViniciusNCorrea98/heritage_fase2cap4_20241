package org.example;

import java.util.ArrayList;
import java.util.List;

public class Products {
    private List<Products> produtoList;


    public Products(){
        this.produtoList = new ArrayList<>();
    }

    String nome;
    float preco;
    String descricao;
    int estoque;
    String fabricante;


    public Products(String nome, float preco, String descricao, int estoque, String fabricante){
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
        this.estoque = estoque;
        this.fabricante = fabricante;

        produtoList.add(this);
    }


    public void exibirProdutos() {
        if (produtoList.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
        } else {
            System.out.println("Produtos cadastrados: ");
            for(Products products : produtoList){
                System.out.println(products);
            }
        }
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", Preço: " + preco + ", Descrição: " + descricao + ", Estoque: " + estoque + ", Fabricante: " + fabricante;
    }
}
