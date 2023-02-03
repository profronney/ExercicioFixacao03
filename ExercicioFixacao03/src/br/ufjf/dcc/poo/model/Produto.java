package br.ufjf.dcc.poo.model;

import java.util.ArrayList;

public class Produto {
	private String nomeProduto;
	private int peso;
	private int qtdeDisponivel;
	private ArrayList<itemPedido> itemPedidos;
	
	public String getNomeProduto() {
		return nomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getQtdeDisponivel() {
		return qtdeDisponivel;
	}
	public void setQtdeDisponivel(int qtdeDisponivel) {
		this.qtdeDisponivel = qtdeDisponivel;
	}
	public ArrayList<itemPedido> getItemPedidos() {
		return itemPedidos;
	}
	public void setItemPedidos(ArrayList<itemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}
	
	public Produto consultarProduto() {
		return null;
	}
}
