package exercicioListaOO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraCombustivelTest {
    @Test
    public void testCalculoMediaConsumo() {
        CalculadoraCombustivel calculadora = new CalculadoraCombustivel(500, 50);
        assertEquals(10.0, calculadora.calcularMediaConsumo(), 0.01);

        calculadora = new CalculadoraCombustivel(600, 40);
        assertEquals(15.0, calculadora.calcularMediaConsumo(), 0.01);
    }
}