package com.sgp.modelos;

public class Main {
    public static void main(String[] args) {
        // Criando o primeiro objeto (usando construtor completo)
        Carro meuCarro = new Carro("Toyota", "Corolla", 2022);
        
        // Criando o segundo objeto (usando construtor alternativo)
        Carro carroReserva = new Carro("Fiat", "Uno");

        // Testando os métodos
        System.out.println(meuCarro.toString());
        meuCarro.ligarMotor();

        System.out.println("\n" + carroReserva.toString());
        // Alterando o ano usando o Setter
        carroReserva.setAno(2010);
        System.out.println("Ano atualizado do Uno: " + carroReserva.getAno());
    }
}