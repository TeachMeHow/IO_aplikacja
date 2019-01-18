package bankingClientTests;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.Locale;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import bankingClient.*;

import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.junit.runner.RunWith;


@RunWith(Parameterized.class)
public class UserTests {

	private Address address;
	private UserID userID;
	private UserData userData;
	private User user;
	
	public static RecipientData[] addressBook = new RecipientData[] {
		new RecipientData("11222233334444555566667777", "Jan Szymański", 
			new Address("Marsz 22", null, "Koszalin", "11111", "Wojewodztwo", "Polska")),
		new RecipientData("11222233334444555566667777", "Jan Kowalskkam", 
				new Address("Marsz 22", null, "Koszalin", "11111", "Wojewodztwo", "Polska")),
		new RecipientData("11222233339999555566667777", "Kamil Hamok", 
			new Address("Marsz 22", null, "Koszalin", "11111", "Wojewodztwo", "Polska")),

		new RecipientData("11222233334444555566667777", "Janusz Maszym", 
			new Address("Marsz 22", null, "Koszalin", "11111", "Wojewodztwo", "Polska"))
	};
	private String phrase;
	private RecipientData[] results;

	@Parameters
	public static Collection phrases() {
		return Arrays.asList(new Object[][] {
			{"Kow", new RecipientData[] { addressBook[1] }},
			{"Jan", new RecipientData[] { addressBook[0], addressBook[1], addressBook[3]}}, 
			{"szym", new RecipientData[] { addressBook[0], addressBook[3]}}, 
			{"99", new RecipientData[] { addressBook[2] }},
			{"Kam", new RecipientData[] { addressBook[1], addressBook[2]}}
			});
	}
	
	
	
	public UserTests(String phrase, RecipientData[] results)
	{
		this.results = results;
		this.phrase = phrase;
	}
	@Before
	public void setUp() throws Exception {
		Date birthDate;
		Date issueDate;
		Date expiryDate;
		Calendar calendar = Calendar.getInstance();
		calendar.set(1998, 7, 23);
		birthDate = new Date(calendar.getTimeInMillis());
		calendar.set(2016, 7, 23);
		issueDate = new Date(calendar.getTimeInMillis());
		calendar.set(2030, 7, 23);
		expiryDate = new Date(calendar.getTimeInMillis());
		address = new Address(
				"Momomowicka 12", 
				null, 
				"Wroclaw", 
				"33-443",
				"Dolnoslaskie",
				"Niemcy");
		userID = new UserID("Kowalski",
				new String[] {"Tomasz", "Maciej"},
				"Smith",
				new String[] {"Monika", "Tadeusz"},
				"98072304434",
				birthDate,
				//null,
				UserID.MALE,
				"Poland",
				"Wroclaw",
				"Urzad jakistam",
				"ABA300000",
				issueDate,
				expiryDate
				);
		Account account = new Account("11222233334444555566667777", 
				AccountType.ROZLICZENIOWY, Currency.getInstance(Locale.GERMANY), 20);
		ArrayList<Account> accounts = new ArrayList<>();
		accounts.add(account);
		userData = new UserData("example@example.com", "+48666262226", userID, address);
		user = new User(userData, accounts, "1234");
		
		for (var recipient : addressBook)
		{
			user.addRecipient(recipient);
		}
		
	}

	@After
	public void tearDown() throws Exception {
		userID = null;
		userData = null;
		user = null;
	}

	@Test
	public void test() {
		RecipientData[] returned = user.getRecipientsMatching(phrase);
		for (var recipient : results)
		{
			boolean found = false;
			for (var recipient2 : returned)
			{
				if (recipient2 == recipient)
					found = true;
			}
			assertTrue(found);
		}
	}
	@Test
	public void testGetRecipientMatchingResultLength() {
		RecipientData[] returned = user.getRecipientsMatching(phrase);
		assertEquals(results.length, returned.length);
	}
}
