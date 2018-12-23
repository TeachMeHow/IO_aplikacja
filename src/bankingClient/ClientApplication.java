package bankingClient;
import java.util.Currency;

public class ClientApplication {

	private boolean userLoggedIn = false;
	private String[] credentials;
	private Connection connection;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	ClientApplication()
	{
		connection = new Connection();
	}
	public void sendTransfer(String sourceAccount,
			String destinationAccount, 
			Currency amount, 
			String title, 
			int type, 
			String recipientName, 
			boolean rememberRecipient) {
		Transfer transfer = new Transfer(sourceAccount, destinationAccount, amount, title, type, recipientName);
		TransferSender sender = new TransferSender(this.connection);
		if (rememberRecipient)
		{
			// add to address book
		}
	}
		
	

}
