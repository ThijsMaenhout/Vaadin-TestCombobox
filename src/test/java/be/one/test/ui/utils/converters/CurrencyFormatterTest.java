/**
 *
 */
package be.one.test.ui.utils.converters;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import be.one.test.test.FormattingTest;

public class CurrencyFormatterTest extends FormattingTest {

	@Test
	public void formattingShoudBeLocaleIndependent() {
		CurrencyFormatter formatter = new CurrencyFormatter();
		String result = formatter.encode(123456);
		assertEquals("$1,234.56", result);
	}
}
