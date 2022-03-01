package com.facade.model;

public class Endereco {
	
	private Integer EnderecoId;
	private String rua;
	private Integer numero;
	private String bairro;
	private String cidade;
	private String estado;
	private String pais;
	
	public Integer getEnderecoId() {
		return EnderecoId;
	}
	public void setEnderecoId(Integer enderecoId) {
		EnderecoId = enderecoId;
	}
	public String getRua() {
		return rua;
	}
	public void setRua(String rua) {
		this.rua = rua;
	}
	public Integer getNumero() {
		return numero;
	}
	public void setNumero(Integer numero) {
		this.numero = numero;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	
	
	
}