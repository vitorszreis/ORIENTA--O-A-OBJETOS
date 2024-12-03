package exerciciosListaOO;

public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidadeAtual;
    private String estado;

    public Carro() {
        this.velocidadeAtual = 0;
        this.estado = "desligado";
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getVelocidadeAtual() {
        return velocidadeAtual;
    }

    public void setVelocidadeAtual(int velocidadeAtual) {
        if (velocidadeAtual < 0) {
            throw new IllegalArgumentException("Velocidade invalida");
        }
        this.velocidadeAtual = velocidadeAtual;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        if (!(estado.equals("ligado") || estado.equals("desligado"))) {
            throw new IllegalArgumentException("Estado invalido");
        }
        this.estado = estado;
    }

    public void acelerar(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        if (this.estado.equals("ligado")) {
            this.velocidadeAtual = this.velocidadeAtual + quantidade;
        }
    }

    public void frear(int quantidade) {
        if (quantidade <= 0) {
            throw new IllegalArgumentException("Quantidade invalida");
        }
        if (this.estado.equals("ligado")) {
            this.velocidadeAtual = this.velocidadeAtual - quantidade;
            if (this.velocidadeAtual < 0) {
                this.velocidadeAtual = 0;
            }
        }
    }

    public void ligar() {
        if (this.estado.equals("desligado")) {
            this.estado = "ligado";
        }
    }

    public void desligar() {
        if (this.estado.equals("ligado")) {
            this.estado = "desligado";
            this.velocidadeAtual = 0;
        }
    }
}
