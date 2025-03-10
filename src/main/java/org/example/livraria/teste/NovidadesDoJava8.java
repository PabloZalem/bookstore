package org.example.livraria.teste;

import org.example.livraria.Autor;
import org.example.livraria.ComparadorPorNome;
import org.example.livraria.produtos.LivroFisico;
import org.example.livraria.produtos.Livros;

import java.util.*;
import java.util.stream.Stream;

public class NovidadesDoJava8 {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");

        Livros javaoo = new LivroFisico(autor);
        javaoo.setNome("Java O.O.");

        Livros java8 = new LivroFisico(autor);
        java8.setNome("Java 8 Prático");

        Livros ruby = new LivroFisico(autor);
        ruby.setNome("Livro de Ruby");

        List<Livros> livros = Arrays.asList(javaoo, java8);
        Collections.sort(livros, new ComparadorPorNome());

        for (Livros livro : livros) {
            System.out.println(livro.getNome());
        }

        // Fazermos um comparator, declarada em uma unica instrucao
        Collections.sort(livros, new Comparator<Livros>() {
            @Override
            public int compare(Livros o1, Livros o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        // metodo sort adicionado no Java8
        livros.sort(new Comparator<Livros>() {
            @Override
            public int compare(Livros o1, Livros o2) {
                return o1.getNome().compareTo(o2.getNome());
            }
        });

        // Empressao Lambda
        livros.sort(
                (l1, l2) -> l1.getNome().compareTo(l2.getNome())
        );

        // utilizando o metodo comparing da interface comparator
        livros.sort(Comparator.comparing(l -> l.getNome()));

        // method reference, para chamada de um unico metodo
        //livros.sort(Comparator.comparing(Livros::getAutor));

        // For-each:
        for (Livros livro : livros) {
            System.out.println(livro.getNome());
        }

        // for-each com lambda
        livros.forEach(l -> System.out.println(l.getNome()));

        // Filtragem por nome
        List<Livros> filtrados = new ArrayList<>();
        for (Livros livro : livros) {
            if (livro.getNome().contains("Java")) {
                filtrados.add(livro);
            }
        }

        // Stream filter
        Stream<Livros> stream = livros.stream().filter(l -> l.getNome().contains("Java"));
        for (Livros livro : livros) {
            System.out.println(livro.getNome());
        }

        // filter
        livros.stream()
                .filter(l -> l.getNome().contains("Java"))
                .forEach(l -> System.out.println(l.getNome()));
    }
}
