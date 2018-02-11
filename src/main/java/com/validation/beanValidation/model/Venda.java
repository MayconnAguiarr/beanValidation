package com.validation.beanValidation.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Venda {
	
	@NotNull
	@Size(min = 1)
	@Valid 
	private List<ItemVenda> itens;
	
	@NotNull
	private Date data;
	
	@DecimalMin("0")
	private float total;
	
	@NotNull
	private TipoVenda tipo;
	
	public Venda() {}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void setItens(List<ItemVenda> itens) {
		this.itens = itens;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public TipoVenda getTipo() {
		return tipo;
	}

	public void setTipo(TipoVenda tipo) {
		this.tipo = tipo;
	}
}
