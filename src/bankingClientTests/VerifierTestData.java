package bankingClientTests;

public class VerifierTestData {
	public String correctPin;
	public String[] inputs;
	public boolean expectedResult;
	VerifierTestData(String correctPin, String[] inputs, boolean expectedResult)
	{
		this.correctPin = correctPin;
		this.inputs = inputs;
		this.expectedResult = expectedResult;
	}
}
