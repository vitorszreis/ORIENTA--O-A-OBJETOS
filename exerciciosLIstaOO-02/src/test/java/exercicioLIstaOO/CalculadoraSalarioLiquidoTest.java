package exercicioLIstaOO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSalarioLiquidoTest {
    @Test
    public void testCalculoSalarioLiquido() {
        CalculadoraSalarioLiquido calculadora = new CalculadoraSalarioLiquido(3000.0, 50.0, 10);
        assertEquals(3220.0, calculadora.calcularSalarioLiquido(), 0.01);

        calculadora = new CalculadoraSalarioLiquido(4000.0, 100.0, 5);
        assertEquals(4140.0, calculadora.calcularSalarioLiquido(), 0.01);
    }
}