package com.rresino.challenge.chemicalsymbolnaming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.rresino.challenge.chemicalsymbolnaming.validate.ValidateParams;

public class FindSymbolByElement {

	public static List<String> findAll(final String elementName) {

		List<String> symbolsListSorted = new ArrayList<>();
		if (ValidateParams.validateElementName(elementName)) {

			final String formattedElementName = elementName.toLowerCase();
			Set<String> symbols = new HashSet<>();

			for (int i = 0; i < formattedElementName.length(); i++) {
				for (int x = i; x < formattedElementName.length(); x++) {
					if (x != i) {
						symbols.add(formattedElementName.substring(i, 1 + i).toUpperCase()
								+ formattedElementName.substring(x, 1 + x));
					}
				}
			}

			symbols.stream().forEach(x -> symbolsListSorted.add(x));
		}

		return symbolsListSorted;
	}

	public static String findOneSorted(final String elementName) {
		if (!ValidateParams.validateElementName(elementName)) {
			return null;
		}

		List<String> symbolsSortedValues = findAll(elementName);
		String response = null;

		if (symbolsSortedValues != null && !symbolsSortedValues.isEmpty()) {
			response = symbolsSortedValues.stream().sorted(String::compareTo).findFirst().get();
		}

		return response;
	}

}
