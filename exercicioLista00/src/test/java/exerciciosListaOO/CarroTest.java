package exerciciosListaOO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarroTest {

    @Test
    void naoDeveSetarVelocidadeAtualNegativa() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.setVelocidadeAtual(-1);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Velocidade invalida", e.getMessage());
        }
    }

    @Test
    void naoDeveSetarEstadoInvalido() {
        try {
            Carro carro = new Carro();
            carro.setEstado("re");
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Estado invalido", e.getMessage());
        }
    }

    @Test
    void deveAcelerarCarroLigado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.acelerar(10);
        assertEquals(110, carro.getVelocidadeAtual());
    }

    @Test
    void naoDeveAcelerarCarroDesligado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.desligar();
        carro.acelerar(10);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void naoDeveAcelerarCarroAcrescimoZero() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.setVelocidadeAtual(100);
            carro.acelerar(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveFrearCarroLigadoPositivo() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.frear(10);
        assertEquals(90, carro.getVelocidadeAtual());
    }


    @Test
    void naoDeveFrearCarroDesligadoPositivo() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.desligar();
        carro.frear(10);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void deveFrearCarroZerado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.frear(150);
        assertEquals(0, carro.getVelocidadeAtual());
    }

    @Test
    void naoDeveFrearCarroAcrescimoZero() {
        try {
            Carro carro = new Carro();
            carro.ligar();
            carro.setVelocidadeAtual(100);
            carro.frear(0);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("Quantidade invalida", e.getMessage());
        }
    }

    @Test
    void deveLigarCarroDesligado() {
        Carro carro = new Carro();
        carro.desligar();
        carro.ligar();
        assertEquals("ligado", carro.getEstado());
    }

    @Test
    void deveDesligarCarroLigado() {
        Carro carro = new Carro();
        carro.ligar();
        carro.desligar();
        assertEquals("desligado", carro.getEstado());
    }


    @Test
    void deveDesligarCarro() {
        Carro carro = new Carro();
        carro.ligar();
        carro.setVelocidadeAtual(100);
        carro.desligar();
        assertEquals("desligado", carro.getEstado());
        assertEquals(0, carro.getVelocidadeAtual());
    }
}
