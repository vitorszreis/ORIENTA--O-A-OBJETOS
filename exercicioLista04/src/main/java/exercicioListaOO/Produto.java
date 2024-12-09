package exercicioListaOO;

public class Produto {
    private String nome;
    private double preco;
    private int quantidadeEstoque;
    private String categoria;

    public Produto(String nome, double preco, int quantidadeEstoque, String categoria) {
        this.nome = nome;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
        this.categoria = categoria;
    }

    public void adicionarEstoque(int quantidade) {
        if (quantidade > 0) {
            this.quantidadeEstoque += quantidade;
        } else {
            System.out.println("A quantidade a adicionar deve ser positiva.");
        }
    }

    public void removerEstoque(int quantidade) {
        if (quantidade > 0) {
            if (this.quantidadeEstoque >= quantidade) {
                this.quantidadeEstoque -= quantidade;
            } else {
                System.out.println("Estoque insuficiente.");
            }
        } else {
            System.out.println("A quantidade a remover deve ser positiva.");
        }
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            double desconto = this.preco * (percentual / 100);
            this.preco -= desconto;
        } else {
            System.out.println("O percentual de desconto deve estar entre 0 e 100.");
        }
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    }
