package com.rresino.challenge.chemicalsymbolnaming;

import org.junit.Assert;
import org.junit.Test;

public class ValidateProposalSymbolTest {

	@Test
	public void validateElementContainsAllLettersOfSymbol() {

		Assert.assertTrue(ValidateProposalSymbol.validate("Xenon", "Nn"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Xenon", "Xx"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Xenon", "Oo"));

		Assert.assertTrue(!ValidateProposalSymbol.validate("Mercury", "HG"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Mercury", "Cy"));

		Assert.assertTrue(ValidateProposalSymbol.validate("AA", "Aa"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abalorio", "Aa"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abalorio", "Ab"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Boron", "Bo"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Boron", "Oo"));

		Assert.assertTrue(!ValidateProposalSymbol.validate("Ab", "Aa"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Aislado", "Bb"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Abalorio", "Xx"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Boron", "Ba"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Boron", "Bb"));

	}

	@Test
	public void validateSymbolContainsSortedLetters() {

		Assert.assertTrue(ValidateProposalSymbol.validate("Magnesium", "Ma"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Magnesium", "Am"));

		Assert.assertTrue(ValidateProposalSymbol.validate("Abcdefg", "Ab"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abcdefg", "Ac"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abcdefg", "Af"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abcdefg", "Df"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Abcdefg", "Fg"));

		Assert.assertTrue(!ValidateProposalSymbol.validate("Abcdefg", "Ba"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Abcdefg", "Dc"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Abcdefg", "gB"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Abcdefg", "Ed"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("Abcdefg", "Ca"));

	}
}
