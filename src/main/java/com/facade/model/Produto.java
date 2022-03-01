package com.facade.model;

public class Produto {
	
	private Integer produtoID;
	private String nome;
	private String marca;
	private Double valor;
	
	public Integer getProdutoID() {
		return produtoID;
	}
	public void setProdutoID(Integer produtoID) {
		this.produtoID = produtoID;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

}