package exercicioListaOO;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LivroTest {

    private Livro livro;

    @BeforeEach
    void setUp() {
        livro = new Livro("Título de Teste", "Autor de Teste", 100);
    }

    @Test
    void abrir() {
        livro.abrir();
        assertTrue(livro.isAberto(), "O livro deveria estar aberto");
    }

    @Test
    void fechar() {
        livro.abrir();
        livro.fechar();
        assertFalse(livro.isAberto(), "O livro deveria estar fechado");
    }

    @Test
    void marcar_pagina() {
        String mensagem = livro.marcar_pagina(50);
        assertEquals("A página 50 está marcada!", mensagem, "A mensagem de marcação da página está incorreta.");
        assertEquals(50, livro.getPaginaAtual(), "A página atual deveria ser 50.");
    }

    @Test
    void setPaginaAtualValida() {
        livro.setNumero_paginas(100);
        livro.setPaginaAtual(75);
        assertEquals(75, livro.getPaginaAtual(), "A página atual deveria ser 75.");
    }

    @Test
    void setPaginaAtualInvalida() {
        assertThrows(IllegalArgumentException.class, () -> livro.setPaginaAtual(0), "Deveria lançar exceção para página inválida.");
        assertThrows(IllegalArgumentException.class, () -> livro.setPaginaAtual(101), "Deveria lançar exceção para página maior que o limite.");
    }

    @Test
    void avancarPagina() {
        livro.setNumero_paginas(100);
        livro.setPaginaAtual(50);
        livro.avancarPagina();
        assertEquals(51, livro.getPaginaAtual(), "A página atual deveria avançar para 51.");
    }

    @Test
    void avancarPaginaExcecao() {
        livro.setNumero_paginas(100);
        livro.setPaginaAtual(100);
        assertThrows(IllegalArgumentException.class, () -> livro.avancarPagina(), "Deveria lançar exceção ao tentar avançar além da última página.");
    }

    @Test
    void retrocederPagina() {
        livro.setNumero_paginas(100);
        livro.setPaginaAtual(50);
        livro.retrocederPagina();
        assertEquals(49, livro.getPaginaAtual(), "A página atual deveria retroceder para 49.");
    }

    @Test
    void retrocederPaginaExcecao() {
        livro.setNumero_paginas(100);
        livro.setPaginaAtual(1);
        assertThrows(IllegalStateException.class, () -> livro.retrocederPagina(), "Deveria lançar exceção ao tentar retroceder antes da primeira página.");
    }
}