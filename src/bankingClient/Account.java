import java.util.Currency;

public class Account{
    String number;
    AccountType accountType;
    Currency amount;

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
    public Currency getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(Currency amount) {
        this.amount = amount;
    }
}