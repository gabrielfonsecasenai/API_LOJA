package com.loja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

    @RestController
    @RequestMapping("/api/loja/produtos")
    public class ProdutoController {
        private TabelaDeProdutos tabelaDeProdutos;

        public ProdutoController() {
            this.tabelaDeProdutos = new TabelaDeProdutos();
    }
    @GetMapping
    public List<Produto> buscarTodosProdutosDaLoja() {
        return this.tabelaDeProdutos.buscarToodosOsProdutos();
    }
}

