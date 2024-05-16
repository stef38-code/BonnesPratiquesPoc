package org.example.dto.simple;

public class AddressDTO {
    private String street;
    private String city;
    private String state;
    private String zip;

    public AddressDTO(String city,
                      String state,
                      String street,
                      String zip) {
        this.city = city;
        this.state = state;
        this.street = street;
        this.zip = zip;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    // getters and setters
}
