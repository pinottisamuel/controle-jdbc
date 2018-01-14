package br.com.jdbc.model;

import java.util.Calendar;

public class Produto {

	private Integer id;
	private String observacao;
	private String nome;
	private double valor;
	private Calendar dataCadastro;
	

	public Produto(String nome, double valor, String observacao) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.observacao = observacao;
	}

	public String getObservacao() {
		return observacao;
	}

	public String getNome() {
		return nome;
	}

	public double getValor() {
		return valor;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}

	public void setId(Integer id) {
		this.id = id;		
	}
	
	@Override
	public String toString() {
		return String.format("[produto: %d %s]", id, nome);
	}
}
