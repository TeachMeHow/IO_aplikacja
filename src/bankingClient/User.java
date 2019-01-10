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
}