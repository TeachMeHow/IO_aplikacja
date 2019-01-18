package bankingClientTests;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;

import bankingClient.Verifier;

@RunWith(Parameterized.class)
public class VerifierTests {
	private String correctPin;
	private String[] inputs;
	private boolean expectedResult;
	
	public VerifierTests(VerifierTestData data) {
		this.correctPin = data.correctPin;
		this.inputs = data.inputs;
		this.expectedResult = data.expectedResult;
	}

	@Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object[] { new VerifierTestData("1234", new String[] { "1234" }, true),
				new VerifierTestData("1234", new String[] { "1111" }, false),
				new VerifierTestData("1234", new String[] { "1111", "2222", "3333", "1234" }, false),
				new VerifierTestData("1234", new String[] { "1111", "2222", "1234" }, true) });
	}
	@Test
	public void testVerify()
	{
		Verifier verifier = new Verifier(correctPin);
		boolean verified = false;
		for (var input : inputs)
		{
			verified = verifier.verify(input);
			if (verified)
				break;
		}
		assertEquals(verified, expectedResult);
	}
/*
	@Test
	public void testCorrectPin() {
		Verifier verifier = new Verifier("1234");
		assertTrue(verifier.verify("1234"));
	}

	@Test
	public void testIncorrectPin() {
		Verifier verifier = new Verifier("1234");
		assertFalse(verifier.verify("1222"));
	}

	@Test
	public void testCorrectPinButNoTriesLeft() {
		Verifier verifier = new Verifier("1234");
		for (int i = 0; i < 3; i++) {
			verifier.verify("1111");
		}
		assertFalse(verifier.verify("1234"));
	}

	@Test
	public void testCorrectPinWithNoTriesLeft() {
		Verifier verifier = new Verifier("1234");
		for (int i = 0; i < 2; i++) {
			verifier.verify("1111");
		}
		assertTrue(verifier.verify("1234"));
	}
*/
	@Test
	public void testGetRemainingTries() {
		Verifier verifier = new Verifier(correctPin);
		for (int i = Verifier.MAX_TRIES; i > -3; i--) {
			int expected = i >= 0 ? i : 0;
			assertEquals(expected, verifier.getRemainingTries());
			verifier.verify("");
		}
	}

}
