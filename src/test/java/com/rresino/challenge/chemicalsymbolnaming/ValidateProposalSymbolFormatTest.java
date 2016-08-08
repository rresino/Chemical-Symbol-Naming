package com.rresino.challenge.chemicalsymbolnaming;

import org.junit.Assert;
import org.junit.Test;

public class ValidateProposalSymbolFormatTest {

	@Test
	public void validateSymbolWasNull() {

		boolean response = ValidateProposalSymbol.validate("FakeElementName", null);
		Assert.assertTrue(!response);

	}

	@Test
	public void validateElementNameWasNull() {

		boolean response = ValidateProposalSymbol.validate(null, "FakeSymbol");
		Assert.assertTrue(!response);

	}

	@Test
	public void validateElementNameAndSymbolWasNull() {

		boolean response = ValidateProposalSymbol.validate(null, null);
		Assert.assertTrue(!response);

	}

	@Test
	public void validateSymbolSize() {

		boolean response = ValidateProposalSymbol.validate("FakeElementName", "");
		Assert.assertTrue(!response);

		response = ValidateProposalSymbol.validate("FakeElementName", "Aaa");
		Assert.assertTrue(!response);

		response = ValidateProposalSymbol.validate("FakeElementName", "Baaaa");
		Assert.assertTrue(!response);
	}

	@Test
	public void validateElementNameSize() {

		boolean response = ValidateProposalSymbol.validate("", "Aa");
		Assert.assertTrue(!response);

		response = ValidateProposalSymbol.validate("A", "Aa");
		Assert.assertTrue(!response);

	}

	@Test
	public void validateRightElementNameAndSymbol() {

		Assert.assertTrue(ValidateProposalSymbol.validate("Spenglerium", "Ee"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Zeddemorium", "Zr"));
		Assert.assertTrue(ValidateProposalSymbol.validate("Venkmine", "Kn"));

	}

	@Test
	public void validateSymbolWasLetter() {

		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "E1"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "1e"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "12"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "_e"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "K_"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "K."));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", ".e"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "+e"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "E*"));
		Assert.assertTrue(!ValidateProposalSymbol.validate("FakeElementName", "E%"));

	}
}
