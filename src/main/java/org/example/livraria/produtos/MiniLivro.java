package org.example.livraria.produtos;

import org.example.livraria.Autor;

public class MiniLivro extends Livros {
    public MiniLivro(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double valor) {
        return false;
    }

    @Override
    public int compareTo(Produto outro) {
        if (this.getValor() < outro.getValor()){
            return -1;
        }
        if (this.getValor() > outro.getValor()){
            return 1;
        }
        return 0;
    }
}
