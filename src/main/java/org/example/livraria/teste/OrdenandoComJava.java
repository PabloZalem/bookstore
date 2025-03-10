package org.example.livraria.teste;

import org.example.livraria.Autor;
import org.example.livraria.produtos.Ebook;
import org.example.livraria.produtos.LivroFisico;
import org.example.livraria.produtos.Produto;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class OrdenandoComJava {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Java 8 Prático");
        fisico.setValor(59.90);
        Ebook ebook = new Ebook(autor);
        ebook.setNome("Java 8 Prático");
        ebook.setValor(29.90);

        List<Produto> produtos = Arrays.asList(fisico, ebook);

        Collections.sort(produtos);

        for (Produto produto : produtos) {
            System.out.println(produto.getValor());
        }
    }
}
