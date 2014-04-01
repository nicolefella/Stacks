//CS201 Lab8
//Nicole Fella

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * This tester will test the methods in ParenthesesChecker 
 * @author nicole
 *
 */
public class ParenthesesCheckerTest {
	
	/**
	 * Instance Field of type ParenthesesChecker which will be instantiated in each test
	 */
	ParenthesesChecker checker;
	
	@Test
	public void testIsCorrect1() {
		checker = new ParenthesesChecker("()");
		assertEquals("Checks if the parentheses for '()' are correct. This should return true.",
				true,
				checker.isCorrect("()"));
	}
	@Test
	public void testIsCorrect2() {
		checker = new ParenthesesChecker("()(()())");
		assertEquals("Checks if the parentheses for '()' are correct. This should return true.",
				true,
				checker.isCorrect("()(()())"));
	}
	@Test
	public void testIsCorrect3() {
		checker = new ParenthesesChecker(")()))");
		assertEquals("Checks if the parentheses for ')()))' are correct. This should return false.",
				false,
				checker.isCorrect(")()))"));
	}
	@Test
	public void testIsCorrect4() {
		checker = new ParenthesesChecker("((())");
		assertEquals("Checks if the parentheses for '((())' are correct. This should return false.",
				false,
				checker.isCorrect("((())"));
	}
}
