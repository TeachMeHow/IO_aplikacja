package bankingClient;
import java.util.Currency;

public class Account{
    String number;
    AccountType accountType;
    int amount;
    Currency cur;
    
    Account(String number, AccountType aType, Currency cur, int amount){
    	this.number = number;
    	this.accountType = aType;
    	this.amount = amount;
    	this.cur = cur;
    }
}