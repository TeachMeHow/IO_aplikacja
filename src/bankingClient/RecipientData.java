public class RecipientData{
    String accountNumber;
    String name;

    //String toString(){}   //sypie błędem
    RecipientData(String accountNumber, String name){}
    RecipientData(String accountNumber, String name, Address address){}

    /**
     * @return the accountNumber
     */
    public String getAccountNumber() {
        return accountNumber;
    }

    /**
     * @param accountNumber the accountNumber to set
     */
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}