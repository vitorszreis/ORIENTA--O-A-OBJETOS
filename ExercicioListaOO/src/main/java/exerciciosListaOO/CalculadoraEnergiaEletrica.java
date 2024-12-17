package exerciciosListaOO;

public class CalculadoraEnergiaEletrica {
    private double quilowattsConsumidos;
    private static final double VALOR_QUILOWATT = 0.12;
    private static final double ICMS = 0.18;

    public CalculadoraEnergiaEletrica(double quilowattsConsumidos) {
        this.quilowattsConsumidos = quilowattsConsumidos;
    }

    public double getQuilowattsConsumidos() {
        return quilowattsConsumidos;
    }

    public void setQuilowattsConsumidos(double quilowattsConsumidos) {
        this.quilowattsConsumidos = quilowattsConsumidos;
    }

    public double calcularValorTotal() {
        double valorSemImposto = quilowattsConsumidos * VALOR_QUILOWATT;
        return valorSemImposto + (valorSemImposto * ICMS);
    }

    public void apresentarResultado() {
        System.out.printf("Valor total a pagar: R$ %.2f\n", calcularValorTotal());
    }
}

