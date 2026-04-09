
package com.mycompany.exercicio32_1;

import java.util.Scanner;

public class Restaurante {

    private String nome;
    private String endereco;
    private String cidade;
    private String tipoComida;
    private double precoMedio;

    // Construtor padrão (valores vazios/zero)
    public Restaurante() {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.tipoComida = "";
        this.precoMedio = 0.0;
    }

    // Construtor com parâmetros
    public Restaurante(String nome, String endereco, String cidade, String tipoComida, double precoMedio) {
        this.nome = nome;
        this.endereco = endereco;
        this.cidade = cidade;
        this.tipoComida = tipoComida;
        this.precoMedio = precoMedio;
    }

    // SETTERS
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public void setPrecoMedio(double precoMedio) {
        this.precoMedio = precoMedio;
    }

    // GETTERS
    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public double getPrecoMedio() {
        return precoMedio;
    }

    // Método para ler dados do usuário
    public void lerDados() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do restaurante: ");
        this.nome = sc.nextLine();

        System.out.print("Endereço: ");
        this.endereco = sc.nextLine();

        System.out.print("Cidade: ");
        this.cidade = sc.nextLine();

        System.out.print("Tipo de comida: ");
        this.tipoComida = sc.nextLine();

        System.out.print("Preço médio do prato: ");
        this.precoMedio = sc.nextDouble();
    }

    // Método para imprimir dados
    public void imprimirDados() {
        System.out.println("\n--- Dados do Restaurante ---");
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Cidade: " + cidade);
        System.out.println("Tipo de comida: " + tipoComida);
        System.out.println("Preço médio: R$ " + precoMedio);
    }
}    

