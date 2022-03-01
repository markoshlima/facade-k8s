package com.facade.model;

import java.sql.Timestamp;
import java.util.ArrayList;

public class Compra {
	
	private Integer compraID;
	private Endereco endereco;
	private ArrayList<Produto> produtos;
	private Double valor;
	private Double descontos;
	private Double total; 
    private Timestamp data;
    private String pagamento;
	private String descontoNome;
	private Integer[] produtoID;
	private Integer enderecoID;
	
	public Integer getCompraID() {
		return compraID;
	}
	public void setCompraID(Integer compraID) {
		this.compraID = compraID;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public ArrayList<Produto> getProdutos() {
		return produtos;
	}
	public void setProdutos(ArrayList<Produto> produtos) {
		this.produtos = produtos;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public Double getDescontos() {
		return descontos;
	}
	public void setDescontos(Double descontos) {
		this.descontos = descontos;
	}
	public Double getTotal() {
		return total;
	}
	public void setTotal(Double total) {
		this.total = total;
	}
	public String getPagamento() {
		return pagamento;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;
	}
	public Timestamp getData() {
		return data;
	}
	public void setData(Timestamp data) {
		this.data = data;
	}
	public String getDescontoNome() {
		return descontoNome;
	}
	public void setDescontoNome(String descontoNome) {
		this.descontoNome = descontoNome;
	}
	public Integer[] getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(Integer[] produtoID) {
		this.produtoID = produtoID;
	}
	public Integer getEnderecoID() {
		return enderecoID;
	}
	public void setEnderecoID(Integer enderecoID) {
		this.enderecoID = enderecoID;
	}
	
	
	
}
       