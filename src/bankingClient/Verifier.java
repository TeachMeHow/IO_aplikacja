
package bankingClient;

public class Verifier {

	public final static int MAX_TRIES = 3;
	private int tries = 0;
	private String correctPin;
	//TODO other attributes and methods
	public Verifier(String pin)
	{
		correctPin = pin;
	}
	public boolean verify(String pin)
	{
		if (tries >= MAX_TRIES) return false;
		tries++;
		return pin == correctPin;
	}
	public int getRemainingTries()
	{
		int remainingTries = MAX_TRIES - tries;
		return remainingTries > 0 ? remainingTries : 0;
	}
	
}
