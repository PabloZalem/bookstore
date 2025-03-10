package org.example.livraria;

import org.example.livraria.produtos.Livros;

import java.util.Comparator;

public class ComparadorPorNome implements Comparator<Livros> {

    @Override
    public int compare(Livros l1, Livros l2) {
        return l1.getNome().compareTo(l2.getNome());
    }


}
