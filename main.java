public class Main {
    public static void main(String[] args) {
        // Criando a instância do carro (Modelo, Marca, Ano)
        Carro meuCarro = new Carro("Civic", "Honda", 2024);

        // Testando as funções básicas do veículo
        meuCarro.buzinar();   // Alerta sonoro
        meuCarro.ligar();     // Partida no motor
        meuCarro.desligar();  // Parada do motor
    }
}