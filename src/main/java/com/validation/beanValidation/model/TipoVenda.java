package com.validation.beanValidation.model;

public enum TipoVenda {

	VendaBrinde("Brinde"), VendaPadrao("Padrão");

	private String tipo;

	private TipoVenda(String tipo) {
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}
}
