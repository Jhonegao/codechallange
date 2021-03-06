package com.br.zen.codechallange.DTO;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

public class PecaNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(min= 3, max=200, message="Tamanho minimo de 3 e máximo de 200 characteres")
	private String nome;
	@NotNull
	private Double pesoLiquido;
	@NotNull
	private Double pesoBruto;
	@NotNull
	private Integer carroId;
	
	public PecaNewDTO() {
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

	public Integer getCarroId() {
		return carroId;
	}

	public void setCarroId(Integer carroId) {
		this.carroId = carroId;
	}
	
}
