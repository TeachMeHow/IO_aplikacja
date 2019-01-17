package bankingClient;
public class User{
    UserID userID;
    UserData userData;
    Account account;
    BankAccountType bankAccountType;

    User(){}
    User(User user){}
    User(UserData userData, UserID id, Account account){
    	this.userData = userData;
    	this.userID = id;
    	this.account = account;
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
}