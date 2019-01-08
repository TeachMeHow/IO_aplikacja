public class BankAccountCreator implements RequestCreator{
    String preferableBankAccount;
    UserData data;

    BankAccountCreator(UserData userData, String accountType){}
    boolean create(){}
    boolean verifyDataUniqueness(){}

    /**
     * @return the preferableBankAccount
     */
    public String getPreferableBankAccount() {
        return preferableBankAccount;
    }

    /**
     * @param preferableBankAccount the preferableBankAccount to set
     */
    public void setPreferableBankAccount(String preferableBankAccount) {
        this.preferableBankAccount = preferableBankAccount;
    }

    /**
     * @return the data
     */
    public UserData getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(UserData data) {
        this.data = data;
    }
}