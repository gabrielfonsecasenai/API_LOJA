package com.loja;

import org.springframework.web.bind.annotation.*;

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
    @GetMapping("/{produtoId}")
    public Produto buscarProdutoPeloIdNaLoja(@PathVariable int produtoId) {
        Produto produtoProcurado = this.tabelaDeProdutos.buscarProdutoPeloId(produtoId);
        return produtoProcurado;
    }
    @PostMapping
    public Produto cadastrarNovoProdutoNaLoja(@RequestBody Produto dadosNovoProduto) {
        return this.tabelaDeProdutos.cadastrarNovoProduto((dadosNovoProduto));
    }
    @PutMapping("/{produtoId}")
    public void atualizarProdutoNaLoja(@PathVariable int produtoId, @RequestBody Produto dadosAtualizarProduto) {
        this.tabelaDeProdutos.atualizarProduto(produtoId, dadosAtualizarProduto);
    }
    @DeleteMapping("/{produtoId}")
    public void removerProdutoNaLoja(@PathVariable int produtoId) {
        this.tabelaDeProdutos.removerProduto(produtoId);
    }
}
