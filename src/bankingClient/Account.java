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

    public void remove_money(int reduceBy){
        //amount = amount - reduceBy
    }
    public void add_money(int add){
        //amount = amount + add
    }
    /**
     * @return the number
     */
    public String getNumber() {
        return number;
    }

    /**
     * @param number the number to set
     */
    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * @return the accountType
     */
    public AccountType getAccountType() {
        return accountType;
    }

    /**
     * @param accountType the accountType to set
     */
    public void setAccountType(AccountType accountType) {
        this.accountType = accountType;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}