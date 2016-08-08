package com.rresino.challenge.chemicalsymbolnaming.main;

import com.rresino.challenge.chemicalsymbolnaming.ValidateProposalSymbol;

public class ValidateSymbolOfElementTask {

	public static void main(String[] args) {
		
		if (args == null || args.length < 2) {
			System.out.println("Invalid params");
			return;
		}

		System.out.println("ValidateProposalSymbol [" + args[0] + "][" + args[1] + "]: "
				+ ValidateProposalSymbol.validate(args[0], args[1]));
	}

}
