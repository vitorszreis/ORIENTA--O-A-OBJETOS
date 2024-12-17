package exercicioListaOO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    private Funcionario funcionario;

    @BeforeEach
    void setUp() {
        funcionario = new Funcionario("João Silva", "Analista", 5000.00, "TI");
    }

    @Test
    void testConstrutorEGetters() {
        assertEquals("João Silva", funcionario.getNome());
        assertEquals("Analista", funcionario.getCargo());
        assertEquals(5000.00, funcionario.getSalario(), 0.01);
        assertEquals("TI", funcionario.getDepartamento());
    }

    @Test
    void testReceberAumento() {
        funcionario.receber_aumento(10);
        assertEquals(5500.00, funcionario.getSalario(), 0.01);
    }

    @Test
    void testReceberAumentoNegativo() {
        double salarioInicial = funcionario.getSalario();
        funcionario.receber_aumento(-5);
        assertEquals(salarioInicial, funcionario.getSalario(), 0.01);
    }

    @Test
    void testMudarDepartamento() {
        funcionario.mudar_departamento("RH");
        assertEquals("RH", funcionario.getDepartamento());
    }

    @Test
    void testSetters() {
        funcionario.setNome("Maria Souza");
        funcionario.setCargo("Gerente");
        funcionario.setSalario(6000.00);
        funcionario.setDepartamento("Vendas");

        assertEquals("Maria Souza", funcionario.getNome());
        assertEquals("Gerente", funcionario.getCargo());
        assertEquals(6000.00, funcionario.getSalario(), 0.01);
        assertEquals("Vendas", funcionario.getDepartamento());
    }

    @Test
    void testExibirDados() {
        // Redireciona a saída padrão para capturar o que é impresso
        java.io.ByteArrayOutputStream out = new java.io.ByteArrayOutputStream();
        System.setOut(new java.io.PrintStream(out));

        funcionario.exibir_dados();

        String expectedOutput = "Nome: João Silva\n" +
                "Cargo: Analista\n" +
                "Salário: R$ 5000,00\n" +
                "Departamento: TI\n";
        assertEquals(expectedOutput, out.toString());

        // Restaura a saída padrão
        System.setOut(System.out);
    }
}