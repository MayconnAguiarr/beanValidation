package com.validation.beanValidation.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

import com.validation.beanValidation.model.TipoVenda;
import com.validation.beanValidation.model.Venda;

public class TotalPorTipoValidator implements ConstraintValidator<TotalPorTipo, Venda> {

	@Override
	public void initialize(TotalPorTipo arg0) {

	}

	@Override
	public boolean isValid(Venda venda, ConstraintValidatorContext context) {

		if (venda == null) {
			return false;
		}

		boolean valido = false;

		if (venda.getTipo() == TipoVenda.VendaPadrao && venda.getTotal() > 0) {
			valido = true;
		}

		if (venda.getTipo() == TipoVenda.VendaBrinde && venda.getTotal() == 0) {
			valido = true;
		}

		if (!valido) {
			context.disableDefaultConstraintViolation();
			context.buildConstraintViolationWithTemplate(context.getDefaultConstraintMessageTemplate())
					.addPropertyNode("tipo").addConstraintViolation();
		}

		return valido;
	}
}
