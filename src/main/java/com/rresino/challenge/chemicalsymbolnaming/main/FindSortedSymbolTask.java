package com.rresino.challenge.chemicalsymbolnaming.main;

import com.rresino.challenge.chemicalsymbolnaming.FindSymbolByElement;

public class FindSortedSymbolTask {

	public static void main(String[] args) {

		if (args == null || args.length < 1) {
			System.out.println("Invalid params");
			return;
		}

		System.out.println(
				"Find first sorted symbol of element [" + args[0] + "]: " + FindSymbolByElement.findOneSorted(args[0]));
	}

}
