package com.validation.beanValidation.model;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemVenda {
	
	@NotNull
	@Size(min = 3, max = 255)
	private String descricao;
	
	@DecimalMin("0.01")
	private float preco;
	
	@Min(1)
	private int quantidade;
	
	public ItemVenda() {}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}
