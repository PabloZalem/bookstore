package org.example.livraria.produtos;

import org.example.livraria.Autor;

public class LivroFisico extends Livros implements Promocional {
    public LivroFisico(Autor autor) {
        super(autor);
    }

    @Override
    public boolean aplicaDescontoDe(double valor) {
        if (valor > 0.3) {
            return false;
        } else {
            double desconto = getValor() * valor;
            setValor(getValor() - desconto);
            System.out.println("Aplicando o desconto no livro físico");
            return true;
        }
    }

    public LivroFisico() {
    }

    public double getTaxaImpressao() {
        return this.getValor() + 0.05;
    }

    @Override
    public boolean aplicaDescontoDe10Porcento() {
        return Promocional.super.aplicaDescontoDe10Porcento();
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
