package exercicioLIstaOO;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    private double altura; // Altura em metros
    private double peso;   // Peso em quilogramas

    // Construtor
    public Pessoa(String nome, int idade, double altura, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
    }

    // Métodos

    // Envelhecer: aumenta a idade em 1 ano.
    public void envelhecer() {
        this.idade++;
    }

    // Crescer: aumenta a altura em centímetros se a idade for menor que 21 anos.
    public void crescer(double centimetros) {
        if (this.idade < 21) {
            this.altura += centimetros / 100; // Converte centímetros para metros
        }
    }

    // Ganhar peso: aumenta o peso em quilos.
    public void ganharPeso(double quilos) {
        this.peso += quilos;
    }

    // Perder peso: diminui o peso em quilos.
    public void perderPeso(double quilos) {
        if (this.peso - quilos >= 0) { // Evita que o peso fique negativo
            this.peso -= quilos;
        } else {
            System.out.println("O peso não pode ser negativo.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    }
