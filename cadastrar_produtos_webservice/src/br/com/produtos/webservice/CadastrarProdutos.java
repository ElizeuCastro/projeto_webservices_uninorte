package br.com.produtos.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.produtos.webservice.modelo.Produtos;

@WebService
public class CadastrarProdutos {

	static ArrayList<Produtos> produtos = new ArrayList<Produtos>();

	public void newProduto(
			@WebParam(name = "nome") String nome,
			@WebParam(name = "valor") Double valor) {
		System.out.println("cadastrou");
		produtos.add(new Produtos(nome, valor));
	}

	public ArrayList<Produtos> getProdutos() {
		return produtos;
	}

}
