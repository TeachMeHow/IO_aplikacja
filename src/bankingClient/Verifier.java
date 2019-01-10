package bankingClient;

public class Verifier {

	private String correctPin;
	//TODO other attributes and methods
	Verifier(String pin)
	{
		correctPin = pin;
	}
	// TODO finish this method
	public boolean verify(String pin)
	{
		return pin == correctPin;
	}
	
}
