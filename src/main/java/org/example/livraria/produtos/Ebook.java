package org.example.livraria.produtos;

import org.example.livraria.Autor;

public class Ebook extends Livros implements Promocional {
    private String waterMark;

    public Ebook(Autor autor) {
        super(autor);
    }

    public Ebook() {
        super();
    }

    public String getWaterMark() {
        return waterMark;
    }

    public void setWaterMark(String waterMark) {
        this.waterMark = waterMark;
    }

    @Override
    public String toString() {
        return "Eu sou um Ebook";
    }

    @Override
    public boolean aplicaDescontoDe(double valor) {
        if (valor > 0.15) return false;
        System.out.println("Aplicando desconto no Ebook");
        return true;
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
