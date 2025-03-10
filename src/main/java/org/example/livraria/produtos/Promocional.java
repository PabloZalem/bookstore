package org.example.livraria.produtos;

@FunctionalInterface
public interface Promocional {
    boolean aplicaDescontoDe(double valor);

    default boolean aplicaDescontoDe10Porcento() {
        return aplicaDescontoDe(0.1);
    }
}
