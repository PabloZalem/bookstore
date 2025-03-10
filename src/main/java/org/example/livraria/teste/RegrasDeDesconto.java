package org.example.livraria.teste;

import org.example.livraria.produtos.Ebook;
import org.example.livraria.produtos.Livros;
import org.example.livraria.produtos.MiniLivro;
import org.example.livraria.Autor;

public class RegrasDeDesconto {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livros livros = new MiniLivro(autor);
        livros.setValor(39.90);

        if (!livros.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto nao pode ser maior que 30%");
        } else {
            System.out.println("Valor de deconto: " + livros.getValor());
        }

        Ebook ebook = new Ebook(autor);
        ebook.setNome("CDI");
        ebook.setValor(29.90);

        if (!ebook.aplicaDescontoDe(0.15)){
            System.out.println("Desconto no ebook nao pode ser maior que 15%");
        } else {
            System.out.println("Valor do ebook com deconto: " + ebook.getValor());
        }
    }
}
