package aula1;

public class Carro {

    // Atributos
    private String nome;
    private String marca;
    private int ano;
    private int velocidade;

    // Construtor
    public Carro(String nome, String marca, int ano, int velocidade) {
        this.nome = nome;
        this.marca = marca;
        this.ano = ano;
        this.velocidade = velocidade;
    }

    // Métodos
    public void acelerar(int aceleracao) {
        velocidade += aceleracao;
    }

    public void frear(int reduzir) {
        velocidade -= reduzir;
    }

    public void buzinar() {
        System.out.println("Bibibi!");
    }

    // Getters e Setters (opcional)
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }
}