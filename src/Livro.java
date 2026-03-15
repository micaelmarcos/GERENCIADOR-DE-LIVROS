/**
 * @author MICAEL MARCOS
 */
public class Livro {

// DECLARAÇÃO DOS ATRIBUTOS DE CLASSE
    private String titulo;
    private String autor;
    private int numero_paginas;
    private int ano_publicacao;
    private double preco;
    private String nome_emprestado; // nome para quem o livro está emprestado, caso não esteja o valor devera ser null.
    
    
// MÉTODO CONSTRUTOR DE CLASSE 
    public Livro(String titulo, String autor, int numero_paginas, int ano_publicacao, double preco, String nome_emprestado) {
       
       // o código abaixo lança uma exceção caso o construtor receba alguns valores que não são esperados como:
       // numero de paginas e preco negativos ou ano de publicação no futuro
       if(numero_paginas < 1 ) {
           throw new IllegalArgumentException("Número de páginas inválidos!");
       } if(ano_publicacao > 2025 ) {
            throw new IllegalArgumentException("Ano de publicação inválido!");
       } if(preco < 0) {
            throw new IllegalArgumentException("Preço inválido!");
       }
       else {
            this.titulo = titulo;
            this.autor = autor;
            this.numero_paginas = numero_paginas;
            this.ano_publicacao = ano_publicacao;
            this.preco = preco;
            this.nome_emprestado = nome_emprestado;          
       }

    }
    
// MÉTODOS GETTERS

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumero_paginas() {
        return numero_paginas;
    }

    public int getAno_publicacao() {
        return ano_publicacao;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome_emprestado() {
        return nome_emprestado;
    }
    
// MÉTODOS SETTERS

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumero_paginas(int numero_paginas) {
        if(numero_paginas < 1) {
            throw new IllegalArgumentException("Número de páginas não pode ser negativo");
        } else {
            this.numero_paginas = numero_paginas;
        }
    }

    public void setAno_publicacao(int ano_publicacao) {
        if(ano_publicacao > 2025) {
            throw new IllegalArgumentException("A publicação não pode ser futura!");
        } else {
            this.ano_publicacao = ano_publicacao;
        }
    }

    public void setPreco(double preco) {
        if(preco < 0) {
            throw new IllegalArgumentException("O preço não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public void setNome_emprestado(String nome_emprestado) {
        this.nome_emprestado = nome_emprestado;
    }
    
}

