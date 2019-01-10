package bankingClient;
import java.util.Currency;

public class ClientApplication {

	private boolean userLoggedIn = false;
	private String[] credentials;
	private Connection connection;
	MyUser user;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ClientApplication()
	{
		connection = new Connection();
	}
	
	// 1.
	public void sendTransfer(String sourceAccount,
			String destinationAccount, 
			Currency amount, 
			String title, 
			int type, 
			String recipientName, 
			boolean rememberRecipient) {
		// 2.
		Verifier verifier = new Verifier(user.getPin());
		for (int i = 0; i < 3; i++)
		{
			// TODO get pin from user
			String pin = "";
			//4
			if (verifier.verify(pin))
			{
				// 4.1
				break;
			}
			// 4.2
			else continue;
		}
		// 1.1
		Transfer transfer = new Transfer(sourceAccount, destinationAccount, amount, title, type, recipientName);
		TransferSender sender = new TransferSender(this.connection);
		// 1.2
		if (rememberRecipient)
		{
			//TODO add to address book
		}
		// 1.3
		sender.execute(transfer);
		// 3.
		transfer = null;
		
	}
		
	

}
