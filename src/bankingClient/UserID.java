package bankingClient;
import java.util.Date;
public class UserID {
	public final static char MALE = 'm';
	public final static char FEMALE = 'f';
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
    
    public UserID(String surname, String givenNames[], String familyName, String parentsGivenNames[],
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

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the givenNames
     */
    public String[] getGivenNames() {
        return givenNames;
    }

    /**
     * @param givenNames the givenNames to set
     */
    public void setGivenNames(String[] givenNames) {
        this.givenNames = givenNames;
    }

    /**
     * @return the familyName
     */
    public String getFamilyName() {
        return familyName;
    }

    /**
     * @param familyName the familyName to set
     */
    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }

    /**
     * @return the parentsGivenNames
     */
    public String[] getParentsGivenNames() {
        return parentsGivenNames;
    }

    /**
     * @param parentsGivenNames the parentsGivenNames to set
     */
    public void setParentsGivenNames(String[] parentsGivenNames) {
        this.parentsGivenNames = parentsGivenNames;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    /**
     * @param dateOfBirth the dateOfBirth to set
     */
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    /**
     * @return the sex
     */
    public char getSex() {
        return sex;
    }

    /**
     * @param sex the sex to set
     */
    public void setSex(char sex) {
        this.sex = sex;
    }

    /**
     * @return the pESEL
     */
    public String getPESEL() {
        return PESEL;
    }

    /**
     * @param pESEL the pESEL to set
     */
    public void setPESEL(String pESEL) {
        PESEL = pESEL;
    }

    /**
     * @return the nationality
     */
    public String getNationality() {
        return nationality;
    }

    /**
     * @param nationality the nationality to set
     */
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    /**
     * @return the placeOfBirth
     */
    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    /**
     * @param placeOfBirth the placeOfBirth to set
     */
    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    /**
     * @return the issuingAuthority
     */
    public String getIssuingAuthority() {
        return issuingAuthority;
    }

    /**
     * @param issuingAuthority the issuingAuthority to set
     */
    public void setIssuingAuthority(String issuingAuthority) {
        this.issuingAuthority = issuingAuthority;
    }

    /**
     * @return the iDCardNumber
     */
    public String getIDCardNumber() {
        return IDCardNumber;
    }

    /**
     * @param iDCardNumber the iDCardNumber to set
     */
    public void setIDCardNumber(String iDCardNumber) {
        IDCardNumber = iDCardNumber;
    }

    /**
     * @return the dateOfIssue
     */
    public Date getDateOfIssue() {
        return dateOfIssue;
    }

    /**
     * @param dateOfIssue the dateOfIssue to set
     */
    public void setDateOfIssue(Date dateOfIssue) {
        this.dateOfIssue = dateOfIssue;
    }

    /**
     * @return the expiryDate
     */
    public Date getExpiryDate() {
        return expiryDate;
    }

    /**
     * @param expiryDate the expiryDate to set
     */
    public void setExpiryDate(Date expiryDate) {
        this.expiryDate = expiryDate;
    }
}