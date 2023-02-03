package br.ufjf.dcc.poo.model;

import java.util.ArrayList;
import java.util.Date;

public class Pedido {
	private String vendedor;
	private Date dataPedido;
	private String status;
	private String observacao;
	private Cliente cliente;
	private ArrayList<itemPedido> itemPedidos;
	
	public String getVendedor() {
		return vendedor;
	}
	public void setVendedor(String vendedor) {
		this.vendedor = vendedor;
	}
	public Date getDataPedido() {
		return dataPedido;
	}
	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public ArrayList<itemPedido> getItemPedidos() {
		return itemPedidos;
	}
	public void setItemPedidos(ArrayList<itemPedido> itemPedidos) {
		this.itemPedidos = itemPedidos;
	}
	
	public void encerrarPedido() {
		
	}
	
	public void cancelarPedido() {
		
	}
	
	
	
	
}
