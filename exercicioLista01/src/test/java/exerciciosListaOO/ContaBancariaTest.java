package exerciciosListaOO;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ContaBancariaTest {

    @Test
    void getTitular() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        assertEquals("Vitor Reis", conta.getTitular());
    }

    @Test
    void setTitular() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        conta.setTitular("Maria Oliveira");
        assertEquals("Maria Oliveira", conta.getTitular());
    }

    @Test
    void getNumero_conta() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        assertEquals(12345, conta.getNumero_conta());
    }

    @Test
    void setNumero_conta() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        conta.setNumero_conta(67890);
        assertEquals(67890, conta.getNumero_conta());
    }

    @Test
    void getSaldo() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        assertEquals(1000.0, conta.getSaldo());
    }

    @Test
    void setSaldo() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        conta.setSaldo(1500.0);
        assertEquals(1500.0, conta.getSaldo());
    }

    @Test
    void depositar() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");
        conta.depositar(500.0);
        assertEquals(1500.0, conta.getSaldo());

        Exception exception = assertThrows(IllegalArgumentException.class, () -> conta.depositar(-50.0));
        assertEquals("Valor inválido para depósito.", exception.getMessage());
    }

    @Test
    void sacar() {
        ContaBancaria conta = new ContaBancaria(12345, 1000.0, "Vitor Reis");

        // Testa tentativa de sacar valor maior que o saldo
        Exception exception1 = assertThrows(IllegalArgumentException.class, () -> conta.sacar(2000.0));
        assertEquals("Quantidade inválida ou saldo insuficiente.", exception1.getMessage());

        // Testa tentativa de sacar valor negativo
        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> conta.sacar(-100.0));
        assertEquals("Quantidade inválida ou saldo insuficiente.", exception2.getMessage());

        // Testa saque válido
        conta.sacar(500.0);
        assertEquals(500.0, conta.getSaldo());
    }
}