package org.example.livraria.teste;

import org.example.livraria.*;
import org.example.livraria.produtos.*;

public class CalculadoraDeEstoque {
    public static void main(String[] args) {
        Ebook ebook = new Ebook();
        ebook.setNome("Java 8 Prático");

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");
        autor.toString();

        Livros livro = new LivroFisico(autor);
        livro.setNome("Java 8 prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.adicionarValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);
        livro.toString();

        System.out.println("Valor com desconto: " + livro.aplicaDescontoDe(0.1));
    }
}
