package com.sgp.modelos;

public class Carro {
    // 1. Atributos (Privados para garantir o encapsulamento)
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado; // Atributo extra para o método específico

    // 2. Construtor Completo
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // Todo carro começa desligado
    }

    // 3. Construtor Alternativo (Ex: Para carros novos de estoque)
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2024; 
        this.ligado = false;
    }

    // 4. Método Específico: Ligar o carro
    public void ligarMotor() {
        if (!ligado) {
            ligado = true;
            System.out.println("Vrummm! O " + modelo + " está ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // 5. Getters e Setters
    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }

    public int getAno() { return ano; }
    public void setAno(int ano) { this.ano = ano; }

    public boolean isLigado() { return ligado; }

    // 6. Método toString
    @Override
    public String toString() {
        return "Carro [Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + "]";
    }
}