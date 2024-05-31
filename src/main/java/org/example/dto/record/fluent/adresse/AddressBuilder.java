package org.example.dto.record.fluent.adresse;



public class AddressBuilder implements StreetStep, CityStep, StateStep, ZipStep, AdresseBuildStep {
    private String street;
    private String city;
    private String state;
    private String zip;

    @Override
    public CityStep rue(String street) {
        this.street = street;
        return this;
    }

    @Override
    public StateStep ville(String city) {
        this.city = city;
        return this;
    }

    @Override
    public ZipStep pays(String state) {
        this.state = state;
        return this;
    }

    @Override
    public AdresseBuildStep codePostal(String zip) {
        this.zip = zip;
        return this;
    }

    @Override
    public AddressDTO construire() {
        return new AddressDTO(street, city, state, zip);
    }
}
