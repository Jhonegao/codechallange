package com.br.zen.codechallange.domain;

import java.io.Serializable;

public class Peca implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String nome;
	private Double pesoLoquido;
	private Double pesoBruto;
	
	public Peca() {
		
	}

	public Peca(Integer id, String nome, Double pesoLoquido, Double pesoBruto) {
		super();
		this.id = id;
		this.nome = nome;
		this.pesoLoquido = pesoLoquido;
		this.pesoBruto = pesoBruto;
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

	public Double getPesoLoquido() {
		return pesoLoquido;
	}

	public void setPesoLoquido(Double pesoLoquido) {
		this.pesoLoquido = pesoLoquido;
	}

	public Double getPesoBruto() {
		return pesoBruto;
	}

	public void setPesoBruto(Double pesoBruto) {
		this.pesoBruto = pesoBruto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peca other = (Peca) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
}
