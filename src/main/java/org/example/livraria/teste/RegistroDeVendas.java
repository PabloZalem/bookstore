package org.example.livraria.teste;

import org.example.CarrinhoDeCompras;
import org.example.livraria.produtos.Ebook;
import org.example.livraria.produtos.LivroFisico;
import org.example.livraria.produtos.Livros;
import org.example.livraria.Autor;
import org.example.livraria.produtos.Produto;

import java.util.List;

public class RegistroDeVendas {
    public static void main(String[] args) {
        Autor autor = new Autor();
        autor.setNome("Mauricio Aniche");
        autor.setEmail("rodrigo.turini@caelum.com.br");
        autor.setCpf("123.456.789.10");
        autor.toString();

        LivroFisico fisico = new LivroFisico(autor);
        fisico.setNome("Test-Driven Development");
        fisico.setValor(59.90);
        if (fisico.aplicaDescontoDe10Porcento()) {
            System.out.println("Valor agora: " + fisico.getValor());
        }

        Livros ebook = new Ebook(autor);
        ebook.setNome("Test-Driven Development");
        ebook.setValor(29.90);
        System.out.println("Valor agora: " + ebook.getValor());
        System.out.println("Valor agora: " + ebook.toString());

        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adiciona(fisico);
        carrinho.adiciona(ebook);

        CarrinhoDeCompras compras = new CarrinhoDeCompras();

        System.out.println("Total: " + carrinho.getTotal());

        List<Produto> produtos = carrinho.getProdutos();
        for(Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}
