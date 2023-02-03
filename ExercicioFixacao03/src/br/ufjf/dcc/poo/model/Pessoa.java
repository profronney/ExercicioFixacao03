package br.ufjf.dcc.poo.model;

import java.util.Date;

public abstract class Pessoa {
	private String nome;
	private Date data;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public int calculoIdade() {
		return 0;
	}
}
