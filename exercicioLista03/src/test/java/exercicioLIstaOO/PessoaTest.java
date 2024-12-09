package exercicioLIstaOO;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PessoaTest {

    private Pessoa pessoa;

    @BeforeEach
    void setUp() {
        pessoa = new Pessoa("João", 20, 1.75, 70.0);
    }

    @Test
    void envelhecer() {
        pessoa.envelhecer();
        assertEquals(21, pessoa.getIdade());
    }

    @Test
    void crescer() {
        pessoa.crescer(5);
        assertEquals(1.80, pessoa.getAltura(), 0.01);
    }

    @Test
    void crescerAposMaioridade() {
        Pessoa pessoaAdulta = new Pessoa("Maria", 25, 1.65, 60.0);
        pessoaAdulta.crescer(5);
        assertEquals(1.65, pessoaAdulta.getAltura(), 0.01);
    }

    @Test
    void ganharPeso() {
        pessoa.ganharPeso(5.0);
        assertEquals(75.0, pessoa.getPeso(), 0.01);
    }

    @Test
    void perderPeso() {
        pessoa.perderPeso(5.0);
        assertEquals(65.0, pessoa.getPeso(), 0.01);
    }

    @Test
    void getNome() {
        assertEquals("João", pessoa.getNome());
    }

    @Test
    void setNome() {
        pessoa.setNome("Pedro");
        assertEquals("Pedro", pessoa.getNome());
    }

    @Test
    void getIdade() {
        assertEquals(20, pessoa.getIdade());
    }

    @Test
    void setIdade() {
        pessoa.setIdade(25);
        assertEquals(25, pessoa.getIdade());
    }

    @Test
    void getAltura() {
        assertEquals(1.75, pessoa.getAltura(), 0.01);
    }

    @Test
    void setAltura() {
        pessoa.setAltura(1.80);
        assertEquals(1.80, pessoa.getAltura(), 0.01);
    }

    @Test
    void getPeso() {
        assertEquals(70.0, pessoa.getPeso(), 0.01);
    }

    @Test
    void setPeso() {
        pessoa.setPeso(75.0);
        assertEquals(75.0, pessoa.getPeso(), 0.01);
    }
}