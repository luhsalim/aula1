package aula1;

public class CarroTestar {

    public static void main(String[] args) {
        // Crie um objeto Carro usando o construtor
        Carro c1 = new Carro("Tracker", "Chevrolet", 2024, 80);

        // Acelere o carro em 40 km/h
        c1.acelerar(40);

        // Exiba a velocidade atual do carro
        System.out.println("Velocidade: " + c1.getVelocidade() + "km/h");
    }
}