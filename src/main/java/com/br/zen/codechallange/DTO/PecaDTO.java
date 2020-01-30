package com.br.zen.codechallange.DTO;

import java.io.Serializable;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.domain.Peca;

public class PecaDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	private Double pesoLiquido;
	private Double pesoBruto;
	private String carro;
	
	public PecaDTO() {
	}
	
	public PecaDTO(Peca obj) {
		
		id = obj.getId();
		nome = obj.getNome();
		pesoLiquido = obj.getPesoLiquido();
		pesoBruto = obj.getPesoBruto();
		carro = obj.getCarro().getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPesoLiquido() {
		return pesoLiquido;
	}

	public void setPesoLiquido(Double pesoLiquido) {
		this.pesoLiquido = pesoLiquido;
	}

	public Double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	public String getCarro() {
		return carro;
	}

	public void setCarro(String carro) {
		this.carro = carro;
	}


	
}
