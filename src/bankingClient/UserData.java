package bankingClient;
public class UserData{
    private String emailAddress;
    private String phoneNumber;
    private UserID userID;
    private Address address;
    
    public UserData(String eAddr, String phone, UserID userID, Address address){
    	this.emailAddress = eAddr;
    	this.phoneNumber = phone;
    	this.setUserID(userID);
    	this.setAddress(address);
    }

    /**
     * @return the emailAddress
     */
    public String getEmailAddress() {
        return emailAddress;
    }

    /**
     * @param emailAddress the emailAddress to set
     */
    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

	public UserID getUserID() {
		return userID;
	}

	public void setUserID(UserID userID) {
		this.userID = userID;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}