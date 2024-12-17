package exercicioListaOO;

public class CalculadoraCombustivel {
    private double quilometrosRodados;
    private double combustivelConsumido;

    public CalculadoraCombustivel(double quilometrosRodados, double combustivelConsumido) {
        this.quilometrosRodados = quilometrosRodados;
        this.combustivelConsumido = combustivelConsumido;
    }

    public double calcularMediaConsumo() {
        return quilometrosRodados / combustivelConsumido;
    }

    public void apresentarResultado() {
        System.out.printf("Média de consumo: %.2f km/l\n", calcularMediaConsumo());
    }
}

