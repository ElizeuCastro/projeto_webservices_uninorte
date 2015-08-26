package br.com.produtos.webservice;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

import br.com.produtos.webservice.modelo.Produtos;

import com.thoughtworks.xstream.XStream;

@WebService
public class CadastrarProdutos {

	ArrayList<Produtos> produtos = new ArrayList<Produtos>();

	@WebMethod
	public void newProduto(
			@WebParam(name = "nome") String nome,
			@WebParam(name = "valor") Double valor) {
		produtos.add(new Produtos(nome, valor));
	}

	@WebMethod
	public String getProdutos() {
		final XStream xstream = new XStream();
		xstream.alias(Produtos.class.getSimpleName(), Produtos.class);
		String xml = xstream.toXML(produtos);
		return xml;
	}

}
