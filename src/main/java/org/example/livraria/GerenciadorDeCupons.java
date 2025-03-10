package org.example.livraria;

import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeCupons {
    private Map<String, Double> cupons;

    public GerenciadorDeCupons() {
        this.cupons = new HashMap<>();

        cupons.put("CUP74", 7.4);
        cupons.put("CUP158", 15.8);
        cupons.put("CUP14", 1.4);
        cupons.put("CUP52", 5.2);
        cupons.put("CUP21", 2.1);
        cupons.put("CUP221", 22.1);
        cupons.put("CUP91", 9.1);
        cupons.put("CUP327", 32.7);
        cupons.put("CUP410", 41.0);
        cupons.put("CUP275", 27.5);
        cupons.put("CUP484", 48.4);
        cupons.put("CUP207", 20.7);
        cupons.put("CUP96", 9.6);
        cupons.put("CUP119", 11.9);
        cupons.put("CUP174", 17.4);
        cupons.put("CUP291", 29.1);
        cupons.put("CUP1", 1.0);
        cupons.put("CUP115", 11.5);
        cupons.put("CUP222", 22.2);
        cupons.put("CUP272", 27.2);
    }

    public Double validaCupom(String cupom) {
        return this.cupons.get(cupom);
    }
}
