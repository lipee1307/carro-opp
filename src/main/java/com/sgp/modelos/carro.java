public class Carro {
    // Atributos (Estado)
    private String modelo;
    private String marca;
    private int ano;
    private boolean motorLigado;

    // Construtor
    public Carro(String modelo, String marca, int ano) {
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.motorLigado = false; // Carros começam desligados por padrão
    }

    // Métodos (Comportamentos)
    public void buzinar() {
        System.out.println(modelo + " está buzinando: Beep beep! ♫");
    }

    public void ligar() {
        if (!motorLigado) {
            motorLigado = true;
            System.out.println("O motor do " + modelo + " deu partida: Vrummm!");
        } else {
            System.out.println("O " + modelo + " já está ligado.");
        }
    }

    public void desligar() {
        if (motorLigado) {
            motorLigado = false;
            System.out.println("O motor do " + modelo + " foi desligado.");
        } else {
            System.out.println("O " + modelo + " já está desligado.");
        }
    }

    // Getters e Setters (Para acessar os dados com segurança)
    public String getModelo() { return modelo; }
    public void setModelo(String modelo) { this.modelo = modelo; }
}