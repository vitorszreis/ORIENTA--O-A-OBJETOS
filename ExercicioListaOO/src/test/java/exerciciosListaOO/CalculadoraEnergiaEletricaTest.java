package exerciciosListaOO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadoraEnergiaEletricaTest {
    @Test
    public void testCalculoValorTotal() {
        CalculadoraEnergiaEletrica calculadora = new CalculadoraEnergiaEletrica(1000);
        assertEquals(141.60, calculadora.calcularValorTotal(), 0.01);

        calculadora = new CalculadoraEnergiaEletrica(500);
        assertEquals(70.80, calculadora.calcularValorTotal(), 0.01);
    }
}
