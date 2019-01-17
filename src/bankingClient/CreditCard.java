package bankingClient;
public class CreditCard{
    String number;
    int CVV;
    float expirationDate;
    String ownerName;
    Account account;
    CardType cardType;

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
     * @return the cVV
     */
    public int getCVV() {
        return CVV;
    }

    /**
     * @param cVV the cVV to set
     */
    public void setCVV(int cVV) {
        CVV = cVV;
    }

    /**
     * @return the expirationDate
     */
    public float getExpirationDate() {
        return expirationDate;
    }

    /**
     * @param expirationDate the expirationDate to set
     */
    public void setExpirationDate(float expirationDate) {
        this.expirationDate = expirationDate;
    }

    /**
     * @return the ownerName
     */
    public String getOwnerName() {
        return ownerName;
    }

    /**
     * @param ownerName the ownerName to set
     */
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    /**
     * @return the account
     */
    public Account getAccount() {
        return account;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account account) {
        this.account = account;
    }

    /**
     * @return the cardType
     */
    public CardType getCardType() {
        return cardType;
    }

    /**
     * @param cardType the cardType to set
     */
    public void setCardType(CardType cardType) {
        this.cardType = cardType;
    }
}