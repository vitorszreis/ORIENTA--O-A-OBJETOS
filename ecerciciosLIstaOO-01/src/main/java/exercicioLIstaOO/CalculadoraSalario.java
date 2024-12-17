package exercicioLIstaOO;

public class CalculadoraSalario {
    private double salarioAtual;
    private double percentualAumento;

    public CalculadoraSalario(double salarioAtual, double percentualAumento) {
        this.salarioAtual = salarioAtual;
        this.percentualAumento = percentualAumento;
    }

    public double calcularAumento() {
        return salarioAtual * (percentualAumento / 100);
    }

    public double calcularNovoSalario() {
        return salarioAtual + calcularAumento();
    }

    public void apresentarResultados() {
        System.out.printf("Valor do aumento: R$ %.2f\n", calcularAumento());
        System.out.printf("Novo salário: R$ %.2f\n", calcularNovoSalario());
    }
}
