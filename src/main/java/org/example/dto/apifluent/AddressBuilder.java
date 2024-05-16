package org.example.dto.apifluent;

public class AddressBuilder implements StreetStep, CityStep, StateStep, ZipStep, AddressBuildStep {
    private AddressDTO address;

    public AddressBuilder() {
        address = new AddressDTO();
    }

    @Override
    public CityStep street(String street) {
        address.setStreet(street);
        return this;
    }

    @Override
    public StateStep city(String city) {
        address.setCity(city);
        return this;
    }

    @Override
    public ZipStep state(String state) {
        address.setState(state);
        return this;
    }

    @Override
    public AddressBuildStep zip(String zip) {
        address.setZip(zip);
        return this;
    }

    @Override
    public AddressDTO build() {
        return address;
    }
}
