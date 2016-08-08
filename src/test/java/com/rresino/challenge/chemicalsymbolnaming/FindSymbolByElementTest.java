package com.rresino.challenge.chemicalsymbolnaming;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class FindSymbolByElementTest {

	@Test
	public void findAllWithEmptyElement() {

		List<String> response = FindSymbolByElement.findAll("");
		Assert.assertTrue(response != null && response.isEmpty());

	}

	@Test
	public void findAllWithNullElement() {

		List<String> response = FindSymbolByElement.findAll(null);
		Assert.assertTrue(response != null && response.isEmpty());

	}

	@Test
	public void findAllWithInvalidElement() {

		List<String> response = FindSymbolByElement.findAll("A1ddd");
		Assert.assertTrue(response != null && response.isEmpty());

		response = FindSymbolByElement.findAll("A");
		Assert.assertTrue(response != null && response.isEmpty());
	}

	@Test
	public void findAllWithTwoDigitsElement() {

		List<String> response = FindSymbolByElement.findAll("Ae");
		Assert.assertTrue(response != null && response.size() == 1);
		Assert.assertTrue("Ae".equals(response.get(0)));

	}

	@Test
	public void findAllWithThreeDigitsElement() {

		List<String> response = FindSymbolByElement.findAll("Aee");
		Assert.assertTrue(response != null && response.size() == 2);
		Assert.assertTrue("Ae".equals(response.get(0)) || "Ee".equals(response.get(0)));
		Assert.assertTrue("Ee".equals(response.get(1)) || "Ae".equals(response.get(1)));

	}

	@Test
	public void findAllWithThreeDigitsElementSorted() {

		List<String> response = FindSymbolByElement.findAll("Acb");
		Assert.assertTrue(response != null && response.size() == 3);
		
		for (String symbol : response) {
			Assert.assertTrue("Ab".equals(symbol) || "Ac".equals(symbol) || "Cb".equals(symbol));
		}
		
	}

	@Test
	public void findAllSize() {

		List<String> response = FindSymbolByElement.findAll("Zuulon");
		Assert.assertTrue(response != null && response.size() == 11);

	}

	@Test
	public void findOneWithNullElement() {

		String symbol = FindSymbolByElement.findOneSorted(null);
		Assert.assertEquals(null, symbol);

	}

	@Test
	public void findOneWithEmptyElement() {

		String symbol = FindSymbolByElement.findOneSorted("");
		Assert.assertEquals(null, symbol);

	}

	@Test
	public void findOneWithInvalidElement() {

		String symbol = FindSymbolByElement.findOneSorted("A");
		Assert.assertEquals(null, symbol);

		symbol = FindSymbolByElement.findOneSorted("A1");
		Assert.assertEquals(null, symbol);

		symbol = FindSymbolByElement.findOneSorted("A ");
		Assert.assertEquals(null, symbol);

		symbol = FindSymbolByElement.findOneSorted("Zur1on");
		Assert.assertEquals(null, symbol);

	}

	@Test
	public void findOneSorted() {

		String symbol = FindSymbolByElement.findOneSorted("Gozerium");
		Assert.assertEquals("Ei", symbol);

		symbol = FindSymbolByElement.findOneSorted("Slimyrine");
		Assert.assertEquals("Ie", symbol);
	}
}
