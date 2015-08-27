package br.com.produtos.webservice.cliente.controle;

import java.util.List;

import br.com.produtos.webservice.cliente.CadastrarProdutos;
import br.com.produtos.webservice.cliente.CadastrarProdutosService;
import br.com.produtos.webservice.cliente.modelo.Produtos;

import com.thoughtworks.xstream.XStream;

public class CtrlCadastrarProdutos {

	CadastrarProdutos cadastrarProdutos;

	public CtrlCadastrarProdutos() {
		cadastrarProdutos = new CadastrarProdutosService()
				.getCadastrarProdutosPort();
	}

	public void newProduto(String nome, Double valor) {
		cadastrarProdutos.newProduto(nome, valor);
	}

	@SuppressWarnings("unchecked")
	public List<Produtos> getProdutos() {
		final XStream xstream = new XStream();
		xstream.alias(Produtos.class.getSimpleName(), Produtos.class);
		List<Produtos> produtos = (List<Produtos>) xstream
				.fromXML(cadastrarProdutos.getProdutos());
		return produtos;
	}

}
