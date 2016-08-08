package com.rresino.challenge.chemicalsymbolnaming.validate;

public class ValidateParams {

	public static boolean validateSymbol(String symbol) {

		return (symbol != null && symbol.length() == 2 && symbol.matches("([a-z]|[A-Z])*"));

	}

	public static boolean validateElementName(String elementName) {

		return (elementName != null && elementName.length() >= 2 && elementName.matches("([a-z]|[A-Z])*"));

	}

}
