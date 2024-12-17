package exercicioLIstaOO;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraSalarioTest {
    @Test
    public void testCalculoAumento() {
        CalculadoraSalario calculadora = new CalculadoraSalario(1000.0, 10.0);
        assertEquals(100.0, calculadora.calcularAumento(), 0.01);
        assertEquals(1100.0, calculadora.calcularNovoSalario(), 0.01);

        calculadora = new CalculadoraSalario(2000.0, 5.0);
        assertEquals(100.0, calculadora.calcularAumento(), 0.01);
        assertEquals(2100.0, calculadora.calcularNovoSalario(), 0.01);
    }
}
