package br.com.produtos.webservices.cliente.controle;

import java.util.List;

import br.com.produtos.webservices.cliente.CadastrarProdutos;
import br.com.produtos.webservices.cliente.CadastrarProdutosService;
import br.com.produtos.webservices.cliente.Produtos;

public class CtrlCadastrarProdutos {

	CadastrarProdutos cadastrarProdutos;

	public CtrlCadastrarProdutos() {
		cadastrarProdutos = new CadastrarProdutosService().getCadastrarProdutosPort();
	}
	
	public void newProduto(String nome, Double valor) {
		cadastrarProdutos.newProduto(nome, valor);
	}

	public List<Produtos> getProdutos() {
		//TODO como recuperar a lista de produtos
		return cadastrarProdutos.getProdutos();
	}

}
