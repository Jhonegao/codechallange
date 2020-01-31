package com.br.zen.codechallange.DTO;

import java.io.Serializable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotEmpty;
import org.hibernate.validator.constraints.Length;
import com.br.zen.codechallange.domain.Carro;

public class CarroNewDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@NotEmpty(message = "Preenchimento obrigatorio")
	@Length(min = 3, max = 200, message = "Tamanho minimo de 3 e máximo de 200 characteres")
	private String nome;

	public CarroNewDTO() {
	}

	public CarroNewDTO(Carro obj) {
		id = obj.getId();
		nome = obj.getNome();
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

}
