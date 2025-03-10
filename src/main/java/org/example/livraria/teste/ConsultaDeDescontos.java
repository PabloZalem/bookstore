package org.example.livraria.teste;

import org.example.livraria.GerenciadorDeCupons;

public class ConsultaDeDescontos {
    public static void main(String[] args) {
        GerenciadorDeCupons gerenciador = new GerenciadorDeCupons();

        Double desconto = gerenciador.validaCupom("CUP74");

       if (desconto != null) {
           System.out.println("Cupom de desconto valido. ");
           System.out.println("Valor: " + desconto);
       } else {
           System.out.println("Esse cupom não existe. ");
       }
    }
}
