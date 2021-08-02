package br.org.generation.Farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
@Table(name = "tb_categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@NotNull
	@Size(min = 5, max = 100)
	private String analgesico;
	
	@NotNull
	@Size(min = 10, max = 500)
	private String antibiotico;
	
	private double preco;
	
	@ManyToOne
	@JsonIgnoreProperties("categoria")
	private Produto produto;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAnalgesico() {
		return analgesico;
	}

	public void setAnalgesico(String analgesico) {
		this.analgesico = analgesico;
	}

	public String getAntibiotico() {
		return antibiotico;
	}

	public void setAntibiotico(String antibiotico) {
		this.antibiotico = antibiotico;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
}
}