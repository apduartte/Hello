package br.com.apduartte.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.apduartte.hello.model.Produto;

@RestController
public class ProdutoController {
	//método para exibir o produto
	@GetMapping("produto")	
	public Produto exibirProduto() {
		Produto p = new Produto(12345,"Computador top de linha do Antonio", 2500);
		return p;
	}
	//método para receber um produto através do http
	@PostMapping("produto")	
	public String recebeProduto(@RequestBody Produto p) {
		System.out.println("Produto recebido = "+p);
		return "OK!";
	}
	

}
