package exerciciosListaOO;

public class ContaBancaria {
    private String titular;
    private int numero_conta;
    private double saldo;

    public ContaBancaria(int numero_conta, double saldo, String titular) {
        this.numero_conta = numero_conta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumero_conta() {
        return numero_conta;
    }

    public void setNumero_conta(int numero_conta) {
        this.numero_conta = numero_conta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            this.saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor inválido para depósito.");
        }
    }
    public void sacar(double valor) {
        if (valor <= 0 || valor > saldo) {
            throw new IllegalArgumentException("Quantidade inválida ou saldo insuficiente.");
        }
        saldo -= valor;
    }



}


