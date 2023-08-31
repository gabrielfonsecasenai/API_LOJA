package com.loja;

import java.util.ArrayList;
import java.util.List;

public class TabelaDeProdutos {
    List<Produto> produtos = new ArrayList<>();

    public TabelaDeProdutos() {
        Produto caneta = new Produto(1, "Caneta BIC", "Caneta BIC na cor Azul", 1.99);
        Produto borracha = new Produto(2, "Borracha branca", "Borracha branca comum", 3.99);
        Produto lapis = new Produto(3, "Lapis FaberCastel", "Lapis FaberCastel comum", 2.99);
        Produto apontador = new Produto(4, "Apontador", "Apontador comum", 7.99);
        Produto caderno = new Produto(5, "Caderno Espiral", "Caderno Espiral comum", 15.99);

        this.produtos.add(caneta);
        this.produtos.add(borracha);
        this.produtos.add(lapis);
        this.produtos.add(apontador);
        this.produtos.add(caderno);
    }

    public List<Produto> getProdutos() {
        return produtos;
    }
    public List<Produto> buscarToodosOsProdutos() {
        return this.getProdutos();
    }
}
