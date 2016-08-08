package com.rresino.challenge.chemicalsymbolnaming;

import com.rresino.challenge.chemicalsymbolnaming.validate.ValidateParams;

public class ValidateProposalSymbol {

	public static boolean validate(final String elementName, final String symbol) {

		if (ValidateParams.validateElementName(elementName) == false
				|| ValidateParams.validateSymbol(symbol) == false) {
			return false;
		}

		final String elementNameFormatted = elementName.toLowerCase();
		final String symbolFormatted = symbol.toLowerCase();

		int firstLetterFirstIndex = elementNameFormatted.indexOf(symbolFormatted.substring(0, 1));
		int secondLetterLastIndex = elementNameFormatted.lastIndexOf(symbolFormatted.substring(1, 2));

		if (firstLetterFirstIndex == -1 || secondLetterLastIndex == -1
				|| secondLetterLastIndex <= firstLetterFirstIndex) {
			return false;
		}

		return true;
	}

}
