package br.com.produtos.webservice;

import javax.xml.ws.Endpoint;

public class Publicador {

	public static void main(String[] args) {
		Endpoint.publish("http://192.168.1.13:8080/cadastrarProdutos",
				new CadastrarProdutos());
	}
}
