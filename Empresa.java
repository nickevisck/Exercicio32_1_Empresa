package com.mycompany.exercicio32_1;

import java.util.Scanner;

public class Empresa {

    private String nome;
    private String endereco;
    private String cidade;
    private String estado;
    private String cep;
    private String fone;

    public Empresa(String nome, String Endereco, String Cidade, String Estado, String Cep, String Fone) {
        this.nome = "";
        this.endereco = "";
        this.cidade = "";
        this.estado = "";
        this.cep = "";
        this.fone = "";
    }

    public String getNome() {
        return nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public String getCep() {
        return cep;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String Estado) {
        this.estado = Estado;
    }

    public void setCep(String Cep) {
        this.cep = Cep;
    }

    public void setFone(String Fone) {
        this.fone = Fone;
    }

    public void solicitarDados() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome da empresa:");
        nome = entrada.nextLine();
        System.out.println("Digite o endereco da empresa:");
        endereco = entrada.nextLine();
        System.out.println("Digite o estado em que a empresa reside:");
        estado = entrada.nextLine();
        System.out.println("Digite a cidade em que a empresa reside:");
        cidade = entrada.nextLine();
        System.out.println("Digite o cep da empresa:");
        cep = entrada.nextLine();
        System.out.println("Digite o fone da empresa:");
        fone = entrada.nextLine();
    }

    @Override
    public String toString() {
        return "Empresa{" + "nome=" + nome + ", endereco=" + endereco + ", cidade=" + cidade + ", estado=" + estado + ", cep=" + cep + ", fone=" + fone + '}';
    }
    
}
