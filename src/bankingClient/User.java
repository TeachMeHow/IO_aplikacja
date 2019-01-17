package bankingClient;

import java.util.ArrayList;

public class User{
    UserID userID;
    UserData userData;
    private ArrayList<Account> accounts;
    BankAccountType bankAccountType;
    private String pin;
    User(){}
    User(User user){}
    User(UserData userData, UserID id, ArrayList<Account>  accounts, String pin){
    	this.userData = userData;
    	this.userID = id;
    	this.setAccounts(accounts);
    	this.pin = pin;
    }

    boolean editUserData(){return true;}
    void addRecipient(String address, String accountNumber, String name){}
    RecipientData getRecipientsMatching(String phrase){
    	String accountNumber = "FILL_IN";
    	String name = "ALSO_FILL_IN";
        RecipientData rData = new RecipientData(accountNumber, name);
        return rData;
    }

    /**
     * @return the userID
     */
    public UserID getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(UserID userID) {
        this.userID = userID;
    }

    /**
     * @return the bankAccountType
     */
    public BankAccountType getBankAccountType() {
        return bankAccountType;
    }

    /**
     * @param bankAccountType the bankAccountType to set
     */
    public void setBankAccountType(BankAccountType bankAccountType) {
        this.bankAccountType = bankAccountType;
    }
	public ArrayList<Account> getAccounts() {
		return accounts;
	}
	public void setAccounts(ArrayList<Account> accounts) {
		this.accounts = accounts;
	}
	public String getPin() {
		return pin;
	}
	public void setPin(String pin) {
		this.pin = pin;
	}
}