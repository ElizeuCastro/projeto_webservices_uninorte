package br.com.produtos.webservice.modelo;

import java.io.Serializable;

public class Produtos implements Serializable {

	private static final long serialVersionUID = 5646772696109933247L;

	private String nome;
	private Double valor;

	public Produtos(String nome, Double valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public Double getValor() {
		return valor;
	}
}
