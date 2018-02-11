package com.validation.beanValidation;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.validation.beanValidation.model.ItemVenda;

public class App {
	public static void main(String[] args) {

		ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
		Validator validator = factory.getValidator();

		ItemVenda item = new ItemVenda();
		item.setDescricao(null);
		item.setPreco(1F);
		item.setQuantidade(1);

		Set<ConstraintViolation<ItemVenda>> violation = validator.validate(item);
		violation.stream().map(constraintViolation -> "Erro: " + 
						constraintViolation.getMessage() + " ["+ 
						constraintViolation.getRootBeanClass().getSimpleName() +
						", "+ constraintViolation.getPropertyPath() + "]")
						.forEachOrdered(System.out::println);
	}
}
