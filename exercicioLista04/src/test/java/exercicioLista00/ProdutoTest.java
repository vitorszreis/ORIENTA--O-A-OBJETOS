package exercicioLista00;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ProdutoTest {

    private Produto produto;

    @BeforeEach
    void setUp() {
        produto = new Produto("Camiseta", 50.0, 100, "Vestuário");
    }

    @Test
    void adicionarEstoque() {
        produto.adicionarEstoque(50);
        assertEquals(150, produto.getQuantidadeEstoque());
    }

    @Test
    void adicionarEstoqueNegativo() {
        int estoqueInicial = produto.getQuantidadeEstoque();
        produto.adicionarEstoque(-10);
        assertEquals(estoqueInicial, produto.getQuantidadeEstoque());
    }

    @Test
    void removerEstoque() {
        produto.removerEstoque(30);
        assertEquals(70, produto.getQuantidadeEstoque());
    }

    @Test
    void removerEstoqueInsuficiente() {
        int estoqueInicial = produto.getQuantidadeEstoque();
        produto.removerEstoque(150);
        assertEquals(estoqueInicial, produto.getQuantidadeEstoque());
    }

    @Test
    void removerEstoqueNegativo() {
        int estoqueInicial = produto.getQuantidadeEstoque();
        produto.removerEstoque(-10);
        assertEquals(estoqueInicial, produto.getQuantidadeEstoque());
    }

    @Test
    void aplicarDesconto() {
        produto.aplicarDesconto(10);
        assertEquals(45.0, produto.getPreco(), 0.01);
    }

    @Test
    void aplicarDescontoInvalido() {
        double precoInicial = produto.getPreco();
        produto.aplicarDesconto(110);
        assertEquals(precoInicial, produto.getPreco(), 0.01);
    }

    @Test
    void getNome() {
        assertEquals("Camiseta", produto.getNome());
    }

    @Test
    void setNome() {
        produto.setNome("Calça");
        assertEquals("Calça", produto.getNome());
    }

    @Test
    void getPreco() {
        assertEquals(50.0, produto.getPreco(), 0.01);
    }

    @Test
    void setPreco() {
        produto.setPreco(60.0);
        assertEquals(60.0, produto.getPreco(), 0.01);
    }

    @Test
    void getQuantidadeEstoque() {
        assertEquals(100, produto.getQuantidadeEstoque());
    }

    @Test
    void setQuantidadeEstoque() {
        produto.setQuantidadeEstoque(200);
        assertEquals(200, produto.getQuantidadeEstoque());
    }

    @Test
    void getCategoria() {
        assertEquals("Vestuário", produto.getCategoria());
    }

    @Test
    void setCategoria() {
        produto.setCategoria("Acessórios");
        assertEquals("Acessórios", produto.getCategoria());
    }
}