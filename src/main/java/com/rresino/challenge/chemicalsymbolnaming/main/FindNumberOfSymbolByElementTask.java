package com.rresino.challenge.chemicalsymbolnaming.main;

import com.rresino.challenge.chemicalsymbolnaming.FindSymbolByElement;

public class FindNumberOfSymbolByElementTask {

	public static void main(String[] args) {

		if (args == null || args.length < 1) {
			System.out.println("Invalid params");
			return;
		}

		System.out.println("Find number of valid symbols of element [" + args[0] + "]: "
				+ FindSymbolByElement.findAll(args[0]).size());
	}

}
