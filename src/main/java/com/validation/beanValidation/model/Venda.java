package com.validation.beanValidation.model;

import java.util.Date;
import java.util.List;

public class Venda {
	
	private List<ItemVenda> itens;
	private Date data;
	private float total;
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
