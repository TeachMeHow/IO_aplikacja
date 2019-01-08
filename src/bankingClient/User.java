public class User{
    int userID;
    BankAccountType bankAccountType;

    User(){}
    User(User user){}
    User(UserData userData){}

    boolean editUserData(){return true;}
    void addRecipient(String address, String accountNumber, String name){}
    RecipientData getRecipientsMatching(String phrase){
        ReceipientData rData = new RecipientData(accountNumber, name);
        return rData;
    }

    /**
     * @return the userID
     */
    public int getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(int userID) {
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