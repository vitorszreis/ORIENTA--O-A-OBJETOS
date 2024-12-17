package exercicioLIstaOO;

public class CalculadoraSalarioLiquido {
    private double salarioBruto;
    private double valorHoraExtra;
    private int numeroHorasExtras;
    private static final double INSS = 0.08;

    public CalculadoraSalarioLiquido(double salarioBruto, double valorHoraExtra, int numeroHorasExtras) {
        this.salarioBruto = salarioBruto;
        this.valorHoraExtra = valorHoraExtra;
        this.numeroHorasExtras = numeroHorasExtras;
    }

    public double calcularSalarioLiquido() {
        double totalBruto = salarioBruto + (valorHoraExtra * numeroHorasExtras);
        return totalBruto - (totalBruto * INSS);
    }

    public void apresentarResultado() {
        System.out.printf("Salário líquido: R$ %.2f\n", calcularSalarioLiquido());
    }
}
