package exercicioListaOO;

public class Livro {
    private String titulo;
    private String autor;
    private int ano_publicacao;
    private int numero_paginas;
    private String genero;
    private int paginaAtual;
    private boolean aberto;

    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numero_paginas = getNumero_paginas();
        this.paginaAtual = 1; // Começa na primeira página
        this.aberto = false; // Começa fechado
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isAberto() {
        return aberto;
    }

    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public void setAno_publicacao(int ano_publicacao) {
        this.ano_publicacao = ano_publicacao;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public void setNumero_paginas(int numero_paginas) {
        if (numero_paginas <= 0) {
            throw new IllegalArgumentException("Numero de conta inválido");
        }
        this.numero_paginas = numero_paginas;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String abrir() {
        this.aberto = true;
        return "O livro foi aberto";
    }

    public String fechar() {
        this.aberto = false;
        return "O livro foi fechado";
    }

    public String marcar_pagina(int pagina) {
        this.paginaAtual = pagina;
        return "A página " + paginaAtual + " está marcada!";
    }

    public int getPaginaAtual() {
        return paginaAtual;
    }

    public void setPaginaAtual(int novaPagina) {
        if (novaPagina <= 0) {
            throw new IllegalArgumentException("A página atual deve ser maior que zero.");
        }
        if (novaPagina > this.numero_paginas) {
            throw new IllegalArgumentException("A página atual não pode ser maior que o total de páginas do livro.");
        }
        this.paginaAtual = novaPagina;
    }

    public void avancarPagina() {
        if (this.paginaAtual < this.numero_paginas) {
            this.paginaAtual++;
        } else {
            throw new IllegalArgumentException("O número total de páginas já foi atingido");
        }
    }

        public void retrocederPagina () {
            if (this.paginaAtual > 1) {
                this.paginaAtual--;
            } else {
                throw new IllegalStateException("Você já está na primeira página e não pode retroceder.");
            }
        }
}