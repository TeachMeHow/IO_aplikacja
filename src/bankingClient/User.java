package bankingClient;

import java.util.ArrayList;

// TODO remove UserID userID from master
public class User{
    UserData userData;
    private ArrayList<Account> accounts;
    BankAccountType bankAccountType;
    private String pin;
    private ArrayList<RecipientData> addressBook = null;
    public User(){}
    User(User user){}
    public User(UserData userData, ArrayList<Account>  accounts, String pin){
    	this.userData = userData;
    	this.setAccounts(accounts);
    	this.pin = pin;
    }

    boolean editUserData(){return true;}
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
	
	public void addRecipient(RecipientData recipient)
	{
		if (addressBook == null)
		{
			addressBook = new ArrayList<>();
		}
		addressBook.add(recipient);
	}
	public RecipientData[] getRecipientsMatching(String phrase)
	{
		if (addressBook == null)
			return null;
		ArrayList<RecipientData> resultAL = new ArrayList<>();
		for (var data : addressBook)
		{
			if (data.getName().contains(phrase) 
					|| data.getAccountNumber().contains(phrase))
			{
				resultAL.add(data);
			}
		}
		RecipientData[] result = new RecipientData[resultAL.size()];
		result = resultAL.toArray(result);
		return result;
		
	}
}