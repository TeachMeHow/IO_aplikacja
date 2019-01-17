package bankingClient;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
public class ClientApplication {

	private boolean userLoggedIn = false;
	private String[] credentials;
	private Connection connection;
	MyUser user;
	public static void main(String[] args) {
		ClientApplication application = new ClientApplication();
		// TODO console mockup
		// STAFI wczytanie z konsoli lub wprowadziÄ‡ to rÄ™cznie tutaj
		// STAFI stworzyÄ‡ uÅ¼ytkownika
		//application.sendTransfer(sourceAccount, destinationAccount, amount, title, type, recipientName, rememberRecipient);
		
		UserData clientData = new UserData("dumledore@hogwarts.com", "913929422");
		String clientNames[] = {"Albus", "Percival", "Wulfrick", "Brian"};
		String clientParentNames[] = {"Mary", "John"};
		@SuppressWarnings("deprecation")
		Date dateOfBirth = new Date(1898, 05, 27);
		Date dateOfIssue = new Date();
		@SuppressWarnings("deprecation")
		Date expiryDate = new Date(2050, 05, 27);
		UserID clientID = new UserID("Dumbledore", clientNames, "Dumbledore", clientParentNames, "98052704125", dateOfBirth, 'M', "British", "Goddrick's Valley", "Pierwszy Urząd Skarbowy w Dolinie Godryka", "2341", dateOfIssue, expiryDate);
		
		Account account = new Account("1234124534679854", AccountType.ROZLICZENIOWY, Currency.getInstance(Locale.UK), 50000);
		User newUser = new User(clientData, clientID, account);
		
		
		System.out.println(newUser.account.accountType);
		TransferMenu tMenu = new TransferMenu();
		Scanner input = new Scanner(System.in);
 
		
		String[] transferData;
		boolean loop = true;
		while(loop) {
			System.out.println("\t\tWITAMY W NASZEJ APLIKACJI BANKOWEJ"); 
			System.out.println("\t\t----------------------------------"); 
			System.out.println("\t\t\tCo chcialbys zrobic?");
			System.out.println("1.Sprawdz Stan Konta\t\t\t\t2.Zloz Wniosek"); 
			System.out.println("3.Sprawdz Oferte\t\t\t\t4.Zrealizuj przelew"); 
			int choice = input.nextInt();
			switch (choice){
			 case 1:
				 System.out.println("Saldo: ");
				 System.out.println(newUser.account.amount);
				 System.out.println(newUser.account.cur);
				 break;
			 case 2:
				 break;
			 case 3:
				 break;
			 case 4:
				 transferData = tMenu.main_Loop();
				 Currency currency = Currency.getInstance(Locale.GERMANY);
				 
				 if(transferData[6]=="GBP") {
					 currency = Currency.getInstance(Locale.ENGLISH);
				 }
				 else
				 {
					 currency = Currency.getInstance(Locale.GERMANY);
				 }
				 application.sendTransfer(newUser.account.number, transferData[4], currency, Integer.parseInt(transferData[5]), transferData[3], 1, transferData[0]+" "+transferData[1], true);
				 break;
			 case 5:
				 loop = false;
				 break;
		} 
		}
		
 
	}
	ClientApplication()
	{
		connection = new Connection();
	}

	
	// 1.
	public void sendTransfer(String sourceAccount,
			String destinationAccount, 
			Currency cur,
			int amount,
			String title, 
			int type, 
			String recipientName, 
			boolean rememberRecipient) {
		// 2.
		/* Include - nie trzeba na teraz
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
		*/
		// 1.1
		Transfer transfer = new Transfer(sourceAccount, destinationAccount, amount, title, type, recipientName);
		TransferSender sender = new TransferSender(this.connection);
		/* Extension point - nie trzeba na teraz
		// 1.2
		if (rememberRecipient)
		{
			//TODO add to address book
		}
		*/
		
		
		// 1.3
		sender.execute(transfer);
		// 3.
		transfer = null;
		
	}
		
	

}
