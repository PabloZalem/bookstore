package org.example;

import org.example.livraria.produtos.Produto;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private double total;
    List<Produto> produtos;

    public CarrinhoDeCompras() {
        this.produtos = new ArrayList<>();
    }

    public void remove(int posicao) {
        this.produtos.remove(posicao);
    }


    public void adiciona(Produto produto) {
        this.produtos.add(produto);
    }


    public List<Produto> getProdutos() {
        return produtos ;
    }

    public double getTotal() {
        return total;
    }
}
