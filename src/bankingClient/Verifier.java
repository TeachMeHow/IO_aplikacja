
package bankingClient;

public class Verifier {

	private final static int MAX_TRIES = 3;
	private int tries = 0;
	private String correctPin;
	//TODO other attributes and methods
	Verifier(String pin)
	{
		correctPin = pin;
	}
	public boolean verify(String pin)
	{
		if (tries >= MAX_TRIES) return false;
		tries++;
		return pin == correctPin;
	}
	
}
