package org.example.livraria.produtos;

import org.example.livraria.Autor;
import org.example.livraria.exception.AutorNuloException;

public abstract class Livros implements Produto {
    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;
    private boolean Ebook;

    public Livros() {
        this.isbn = "000-00-00000-00-0";
    }

    public Livros(Autor autor) {
        this();
        if (autor == null) {
            throw new AutorNuloException("O Autor do Livro não pode ser nulo");
        }
        this.autor = autor;
        this.Ebook = false;
    }

    public abstract boolean aplicaDescontoDe(double valor);

    public double adicionarValor(double valor) {
        return this.valor = valor;
    }

    boolean temAutor() {
        return this.autor != null;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Mostrando detalhes do livro\n");
        sb.append("Nome: ").append(nome).append("\n");
        sb.append("Descrição: ").append(descricao).append("\n");
        sb.append("Valor: ").append(valor).append("\n");
        sb.append("ISBN: ").append(isbn).append("\n");

        if (this.temAutor()) {
            sb.append(autor.toString()).append("\n");
        }

        sb.append("--");

        return sb.toString();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }
}
