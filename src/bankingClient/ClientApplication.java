package bankingClient;

import java.util.ArrayList;
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
		// application.sendTransfer(sourceAccount, destinationAccount, amount, title,
		// type, recipientName, rememberRecipient);

		UserData clientData = new UserData("dumledore@hogwarts.com", "913929422", null, null);
		String clientNames[] = { "Albus", "Percival", "Wulfrick", "Brian" };
		String clientParentNames[] = { "Percival", "Kendra" };
		@SuppressWarnings("deprecation")
		Date dateOfBirth = new Date(1898, 05, 27);
		Date dateOfIssue = new Date();
		@SuppressWarnings("deprecation")
		Date expiryDate = new Date(2050, 05, 27);
		UserID clientID = new UserID("Dumbledore", clientNames, "Dumbledore", clientParentNames, "98052704125",
				dateOfBirth, 'M', "British", "Goddrick's Valley", "Pierwszy Urząd Skarbowy w Dolinie Godryka", "2341",
				dateOfIssue, expiryDate);

		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(new Account("1234090209097757", AccountType.ROZLICZENIOWY, Currency.getInstance(Locale.UK), 0));
		User newUser = new User(clientData, accounts, "1234");

		System.out.println(accounts.get(0).accountType);

		TransferMenu tMenu;
		Scanner input = new Scanner(System.in);

		String[] transferData;
		boolean loop = true;
		while (loop) {
			System.out.println("\t\tWITAMY W NASZEJ APLIKACJI BANKOWEJ");
			System.out.println("\t\t----------------------------------");
			System.out.println("\t\t\tCo chcialbys zrobic?");
			System.out.println("1.Sprawdz Stan Konta\t\t\t\t2.Zloz Wniosek");
			System.out.println("3.Sprawdz Oferte\t\t\t\t4.Zrealizuj przelew");
			int choice = input.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Saldo: ");
				System.out.println(newUser.getAccounts().get(0).amount);
				System.out.println(newUser.getAccounts().get(0).cur);
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				tMenu = new TransferMenu(newUser);
				// PU Weryfikacja tożsamości
				System.out.println("Podaj PIN");
				Verifier verifier = new Verifier(newUser.getPin());
				boolean verified = false;
				for (int i = 0; i < 3; i++) {
					if (verifier.verify(input.next())) {
						verified = true;
						break;
					}
				}
				if (verified == true)
				{
				application.sendTransfer(newUser.getAccounts().get(0).getNumber(), tMenu.address, tMenu.cur,
						Integer.parseInt(tMenu.amount), tMenu.title, tMenu.transferType, tMenu.name,
						tMenu.rememberRecipient);
				}
				break;
			case 5:
				loop = false;
				break;
			}
		}

	}

	ClientApplication() {
		connection = new Connection();
	}

	// 1.
	public void sendTransfer(String sourceAccount, String destinationAccount, Currency cur, int amount, String title,
			int type, String recipientName, boolean rememberRecipient) {
		// 2.
		/*
		 * Include - nie trzeba na teraz Verifier verifier = new
		 * Verifier(user.getPin()); for (int i = 0; i < 3; i++) { // TODO get pin from
		 * user String pin = ""; //4 if (verifier.verify(pin)) { // 4.1 break; } // 4.2
		 * else continue; }
		 */
		// 1.1
		Transfer transfer = new Transfer(sourceAccount, destinationAccount, amount, title, type, recipientName);
		TransferSender sender = new TransferSender(this.connection, transfer);
		/*
		 * Extension point - nie trzeba na teraz // 1.2 if (rememberRecipient) { //TODO
		 * add to address book }
		 */

		// 4.
		sender.execute();
		// 5.
		transfer = null;

	}
}

class TransferMenu {
	public String address;
	public String name;
	public String title;
	public String accountNumber;
	public String amount;
	public Currency cur;
	public boolean rememberRecipient;
	public int transferType;
	public String sourceAccount;
	private User user;

	TransferMenu(User user) {
		this.user = user;
		Scanner input = new Scanner(System.in);
		// Wybór typu przelewu
		System.out.println("Rodzaj przelewu: \n" + "1. Przelew zewnętrzny\n" + "2. Przelew własny");
		transferType = input.nextInt();
		if (transferType == 1) {
			transferType = 1;
		} else if (transferType == 2) {
			transferType = 0;
		} else {
			transferType = 1;
		}
		// konto źródłowe
		System.out.println("Wybierz konto źródłowe:");
		sourceAccount = chooseAccount(input);
		// [choice node]
		// [przelew zwykły]
		if (transferType == 1) {
			boolean correctData = false;
			// Wpisanie danych
			while (!correctData) {
				// TODO ewentualny EP Dodanie z ksiązki adresowej
				System.out.println("\t\t\tPodaj dane adresata...");
				System.out.println("Nazwa...");
				name = input.next();
				System.out.println("\n...Adres...");
				address = input.next();
				System.out.println("\nTytul...");
				title = input.next();
				System.out.println("\nPodaj numer konta...");
				accountNumber = input.next();
				accountNumber = accountNumber.replaceAll("\\s", "");

				// Sprawdzenie poprawności danych
				correctData = dataValidation();
				// [choice node]
				// [niepoprawne]
				
			}
			// [poprawne]

			// Dodanie adresata do książki adresowej
			char ch = 'x';
			while (!(ch == 'y' || ch == 'Y' || ch == 'n' || ch == 'N')) {

				System.out.println("\nCzy zapamietac adresata? [y/N]");
				ch = input.next().charAt(0);
				if (ch == 'y' || ch == 'Y') {
					rememberRecipient = true;
				} else if (ch == 'n' || ch == 'N') {
					rememberRecipient = false;
				} else {
					System.out.println("Zly wybor!");
				}
			}
		}
		// [przelew własny]
		else {
			String strAccount = null;
			// Wybór rachunków między którymi ma się wykonać przelew
			do {
				System.out.println("Wybierz konto: ");
				strAccount = chooseAccount(input);
				if (strAccount == sourceAccount) {
					System.out.println("Nie można przelać na to samo konto");
				}
			} while (strAccount != sourceAccount);

		}

		// [merge]
		// Wpisanie kwoty przelewu
		System.out.println("\nKwota...");
		amount = input.next();
		
		System.out.println("\nWaluta (GBP, EUR)");
		String strCur = input.next();
		if (strCur.equals("GBP")) {
			cur = Currency.getInstance(Locale.UK);
		} else if (strCur.equals("EUR")) {
			cur = Currency.getInstance(Locale.GERMANY);
		}
		// default currency
		else {
			cur = Currency.getInstance(Locale.GERMANY);
		}

		input.close();
	}

	private String chooseAccount(Scanner input) {
		String ret = null;
		ArrayList<Account> userAccounts = user.getAccounts();
		int i = 1;
		for (Account account : userAccounts) {
			System.out.println(String.valueOf(i) + ". " + account.getNumber() + " (" + String.valueOf(account.amount)
					+ account.cur.toString() + ")");
		}
		i = 0;
		while (i < 1 || i > userAccounts.size()) {
			i = input.nextInt();
			if (i < 1 || i > userAccounts.size()) {
				System.out.println("Takie konto nie istnieje");
				continue;
			}
			ret = userAccounts.get(i - 1).getNumber();
		}
		return ret;

	}

	boolean dataValidation() {

		if (this.name == "" || this.name == null) {
			return false;
		}
		if (this.address == "" || this.address == null) {
			return false;
		}
		if (this.title == "" || this.title == null) {
			return false;
		}
		if (this.accountNumber.length() != 16) {
			return false;
		}
		return true;

	}
}
