package br.com.jdbc.entities;

import java.math.BigDecimal;
import java.util.Calendar;

public class Produto {

	private Integer id;	
	private String nome;
	private BigDecimal valor;
	private Calendar dataCadastro;
	private String observacao;
	

	public Produto(String nome, BigDecimal valor, String observacao) {
		super();
		this.nome = nome;
		this.valor = valor;
		this.observacao = observacao;
	}

	
	public Integer getId() {
		return id;
	}


	public String getObservacao() {
		return observacao;
	}

	public String getNome() {
		return nome;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public Calendar getDataCadastro() {
		return dataCadastro;
	}
	
	
	@Override
	public String toString() {
		return String.format("[produto: %d %s]", id, nome);
	}
	
	public void setId(Integer id) {
		this.id = id;		
	}

	public void setDataCadastro(Calendar dtCadastro) {
		this.dataCadastro = dtCadastro;
		
	}
}
