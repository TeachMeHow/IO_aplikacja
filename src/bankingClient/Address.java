package bankingClient;
public class Address{
    String streetAddress;
    String addressLine2;
    String city;
    String postalCode;
    String voivodeship;
    String country;

    public Address(
    String streetAddress,
    String addressLine2,
    String city,
    String postalCode,
    String voivodeship,
    String country)
    {

        this.streetAddress = streetAddress;
        this.addressLine2 = addressLine2;
        this.city = city;
        this.postalCode = postalCode;
        this.voivodeship = voivodeship;
        this.country = country;
    }
    /**
     * @return the streetADdress
     */
    public String getStreetAddress() {
        return streetAddress;
    }

    /**
     * @param streetADdress the streetADdress to set
     */
    public void setStreetAddress(String streetADdress) {
        this.streetAddress = streetADdress;
    }

    /**
     * @return the addressLine2
     */
    public String getAddressLine2() {
        return addressLine2;
    }

    /**
     * @param addressLine2 the addressLine2 to set
     */
    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @param postalCode the postalCode to set
     */
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * @return the voivodeship
     */
    public String getVoivodeship() {
        return voivodeship;
    }

    /**
     * @param voivodeship the voivodeship to set
     */
    public void setVoivodeship(String voivodeship) {
        this.voivodeship = voivodeship;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }
}