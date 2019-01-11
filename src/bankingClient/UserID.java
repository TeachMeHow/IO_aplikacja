package bankingClient;
import java.util.Date;
public class UserID{
    String surname;
    String givenNames[];		
    String familyName;
    String parentsGivenNames[];
    Date dateOfBirth;
    char sex;
    String PESEL;
    String nationality;
    String placeOfBirth;
    String issuingAuthority;
    String IDCardNumber;
    Date dateOfIssue;
    Date expiryDate;
    
    UserID(String surname, String givenNames[], String familyName, String parentsGivenNames[],
    		String PESEL, Date dateOfBirth, char sex, String nationality, String placeOfBirth,
    		String issuingAuthority, String IDCardNumber, Date dateOfIssue, Date expiryDate)
    {
    	this.surname = surname;
    	this.givenNames = givenNames;
    	this.familyName = familyName;
    	this.parentsGivenNames = parentsGivenNames;
    	this.PESEL = PESEL;
    	this.dateOfBirth = dateOfBirth;
    	this.sex = sex;
    	this.nationality = nationality;
    	this.placeOfBirth = placeOfBirth;
    	this.issuingAuthority = issuingAuthority;
    	this.IDCardNumber = IDCardNumber;
    	this.dateOfIssue = dateOfIssue;
    	this.expiryDate = expiryDate;
    }
}