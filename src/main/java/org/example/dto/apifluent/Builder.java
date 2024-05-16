package org.example.dto.apifluent;

import java.time.LocalDate;

public class Builder implements FirstNameStep, LastNameStep, BirthDateStep, AddressStep, BuildStep {
    private PersonDTO person;

    public Builder() {
        person = new PersonDTO();
    }

    @Override
    public LastNameStep firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    @Override
    public BirthDateStep lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    @Override
    public AddressStep birthDate(LocalDate birthDate) {
        person.setBirthDate(birthDate);
        return this;
    }


    @Override
    public BuildStep address(AddressBuilder addressBuilder) {
        person.setAddress(addressBuilder.build());
        return this;
    }

    @Override
    public BuildStep noAddress() {
        return this;
    }

    @Override
    public PersonDTO build() {
        return person;
    }
}
