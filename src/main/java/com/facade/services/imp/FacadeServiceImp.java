package com.facade.services.imp;

import java.util.ArrayList;

import com.facade.model.Cliente;
import com.facade.model.Compra;
import com.facade.model.Endereco;
import com.facade.model.Produto;
import com.facade.services.FacadeService;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FacadeServiceImp implements FacadeService {
	
	@Value("${url.cliente}")
	private String urlCliente;
	
	@Value("${url.endereco}")
	private String urlEndereco;
	
	@Value("${url.compra}")
	private String urlCompra;
	
	@Value("${url.produto}")
	private String urlProduto;
	
	@Override
	public Cliente getClienteOverview(Integer clienteID) {
		
		RestTemplate rt = new RestTemplate();
		Cliente cliente = this.getCliente(clienteID, rt);
		cliente.setEnderecos(this.getEnderecosCliente(clienteID, rt));
		cliente.setCompras(this.getComprasCliente(clienteID, rt));
	
		return cliente;
	}
	
	/**
	 * Obtem o cliente pelo ID 
	 */
	public Cliente getCliente(Integer clienteID, RestTemplate rt){
		return rt.getForObject(urlCliente+clienteID, Cliente.class);
	}
	
	/**
	 * Obtem os enderecos do cliente
	 */
	public ArrayList<Endereco> getEnderecosCliente(Integer clienteID, RestTemplate rt){
		ResponseEntity<ArrayList<Endereco>> REenderecos = 
		  rt.exchange(
		    urlEndereco+"cliente/"+clienteID,
		    HttpMethod.GET,
		    null,
		    new ParameterizedTypeReference<ArrayList<Endereco>>() {}
		  );
		ArrayList<Endereco> enderecos = REenderecos.getBody();
		return enderecos;
	}
	
	/**
	 * Obtem as compras do cliente
	 */
	public ArrayList<Compra> getComprasCliente(Integer clienteID, RestTemplate rt){
		ResponseEntity<ArrayList<Compra>> REcompras = 
		  rt.exchange(
		    urlCompra+"?clienteID="+clienteID,
		    HttpMethod.GET,
		    null,
		    new ParameterizedTypeReference<ArrayList<Compra>>() {}
		  );
		ArrayList<Compra> compras = REcompras.getBody();
		compras = this.getComprasProdutosCliente(compras, rt); 
		return compras;
	} 
	
	/**
	 * Obtem os detalhes/produtos das compras do cliente 
	 */
	public ArrayList<Compra> getComprasProdutosCliente(ArrayList<Compra> compras, RestTemplate rt){
		
		for(Compra compra : compras){
            if(compra.getProdutoID().length > 0){
            	compra.setProdutos(new ArrayList<>());
            	
            	for(Integer p : compra.getProdutoID()){
					Produto produto = rt.getForObject(urlProduto+p, Produto.class);
					compra.getProdutos().add(produto);
            	}
            }
            compra.setEndereco(this.getEnderecoCompra(compra.getEnderecoID(), rt));
        }
		return compras;
	}
	
	/**
	 * Obtem o endereco da compra do cliente
	 */
	public Endereco getEnderecoCompra(Integer enderecoID, RestTemplate rt){
		return rt.getForObject(urlEndereco+enderecoID, Endereco.class);
	}

}
