package com.br.zen.codechallange.DTO;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import com.br.zen.codechallange.domain.Carro;
//import com.br.zen.codechallange.domain.Carro;
import com.br.zen.codechallange.domain.Peca;

public class PecaDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(min= 3, max=200, message="Tamanho minimo de 3 e máximo de 200 characteres")
	private String nome;
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(min= 3, max=200, message="Peso Liquido nao pode ser maior que o peso Bruto")
	private Double pesoLiquido;
	@NotEmpty(message="Preenchimento obrigatorio")
	@Length(min= 3, max=200, message="Peso Liquido nao pode ser maior")
	private Double pesoBruto;
	@NotNull(message = "Deve se vincular a um modelo de carro")
	private Carro carro;

	public PecaDTO() {
	}

	public PecaDTO(Peca obj) {

		id = obj.getId();
		nome = obj.getNome();
		pesoLiquido = obj.getPesoLiquido();
		pesoBruto = obj.getPesoBruto();
		carro = obj.getCarro();
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

	public Carro getCarro() {
		return carro;
	}

	public void setCarro(Carro carro) {
		this.carro = carro;
	}

}
