package org.example;

import org.example.entities.Bebida;
import org.example.entities.Eletronico;
import org.example.entities.Vestuario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);
        Products produto = new Products();
        Foods food = new Foods();

        int option;
        do{
            System.out.println("Escolha uma opção\n1-Exibir Produtos\n2-Cadastrar produto\n0-Sair\n");
            option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.println("Produtos cadastrados:");
                    produto.exibirProdutos();
                    break;
                case 2:
                    System.out.println("\nEscreva o nome do produto:");
                    String nome= sc.next() + sc.nextLine();
                    System.out.println("\nEscreva o preço do produto:");
                    float preco =sc.nextFloat();
                    System.out.println("\nEscreva a descrição do produto:");
                    String descricao = sc.next() + sc.nextLine();
                    System.out.println("\nEscreva o numero de produtos no estoque:");
                    int estoque = sc.nextInt();


                    System.out.println("\nEscreva o nome do fabricante:");
                    String nomeDoFabricante= sc.next() + sc.nextLine();
                    System.out.println("\nEscreva o endereço do fabricante:");
                    String enderecoDoFabricante= sc.next() + sc.nextLine();
                    System.out.println("\nEscreva o telefone do fabricante:");
                    String telefoneDoFabricante= sc.next() + sc.nextLine();

                    Fabricante fabricante = new Fabricante(nomeDoFabricante, enderecoDoFabricante, telefoneDoFabricante);



                    produto.nome = nome;
                    produto.preco = preco;
                    produto.descricao = descricao;
                    produto.estoque = estoque;

                    int op;
                    System.out.println("\nEscolha uma opção\n1-Cadastrar produto ELETRONICO:\n2-Cadastrar produto de VESTUÁRIO:\n3-Cadastrar produto ALIMENTÍCIO:\n4-Cadastrar produto BEBIDA:\n0-Sair\n");

                    op = sc.nextInt();

                    switch (op){

                        case 1:
                            System.out.println("\nVamos cadastrar produto ELETRONICO!\n");


                            System.out.println("\nDigite o nome do modelo: \n");
                            String modelo = sc.next() + sc.nextLine();
                            Eletronico eletronico = new Eletronico(modelo);

                            System.out.println(produto+ fabricante.toString() + eletronico.toString());

                            break;


                        case 2:
                            System.out.println("\nVamos cadastrar produto de VESTUÁRIO!\n");

                            System.out.println("\nDigite o nome a cor da roupa: \n");
                            String cor = sc.next();
                            System.out.println("\nDigite o nome do material da roupa: \n");
                            String material = sc.next();
                            System.out.println("\nDigite o tamanho da roupa: \n");
                            String tamanho = sc.next();

                            Vestuario vestuario = new Vestuario(tamanho,cor,material);

                            System.out.println(produto + fabricante.toString() + vestuario.toString());


                            break;
                        case 3:
                            System.out.println("\nVamos cadastrar produto ALIMENTÍCIO!\n");
                            sc.nextLine();
                            System.out.println("\nDigite a data de validade do produto: \nExemplo: 2024-01-01 \n");

                            String dataValidadeStr = sc.next();
                            LocalDate dataValidade = LocalDate.parse(dataValidadeStr, DateTimeFormatter.ISO_LOCAL_DATE);
                            sc.nextLine();

                            System.out.println("\nDigite os ingredientes: \n");
                            String ingredientes = sc.next() + sc.nextLine();

                            Foods food1 = new Foods(ingredientes, dataValidade);


                            System.out.println(produto+ fabricante.toString() + food1.toString());

                            break;
                        case 4:
                            System.out.println("\nVamos cadastrar produto de BEBIDA!\n");

                            System.out.println("\nDigite a data de validade do produto: \nExemplo: 2024-01-01 \n");
                            String dataValidadeStr1 = sc.next();
                            LocalDate dataValidade1 = LocalDate.parse(dataValidadeStr1, DateTimeFormatter.ISO_LOCAL_DATE);
                            sc.nextLine();

                            System.out.println("\nDigite os ingredientes: \n");
                            String ingredientes1 = sc.next() + sc.nextLine();

                            Foods foods = new Foods(ingredientes1, dataValidade1);

                            System.out.println("Digite se a bebida é alcolica: \nTrue(Verdadeiro)/False(Falso)\n ");
                            boolean alcoolico = sc.nextBoolean();
                            System.out.println("Digite o volume da bebida: \n ");
                            String volume = sc.next();

                            Bebida bebida = new Bebida(alcoolico, volume);
                            System.out.println(produto+ fabricante.toString() + bebida.toString() + foods.toString());

                            break;
                    }
                case 0:
                    System.out.println("Programa finalizado");
                    System.out.println("--------------------");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }
        } while(option!=0);

        sc.close();
    }
}