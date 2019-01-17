package bankingClient;
public class BankAccountCreator implements RequestCreator{
    String preferableBankAccount;
    UserData data;

    BankAccountCreator(UserData userData, String accountType){}
    public boolean create(){
		return false;}
    boolean verifyDataUniqueness(){
		return false;}

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
	@Override
	public boolean isVerified() {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public void setVerified(boolean isVerified) {
		// TODO Auto-generated method stub
		
	}
}