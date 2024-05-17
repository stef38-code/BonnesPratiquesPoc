package org.example.dto.apifluent.person;

import org.example.dto.apifluent.adress.AddressDTO;
import org.example.dto.apifluent.email.EmailDTO;
import org.example.dto.apifluent.phone.PhoneNumberDTO;

import java.time.LocalDate;
import java.util.List;

public class PersonBuilder implements FirstNameStep, LastNameStep, BirthDateStep, AddressStep, PhoneNumbersStep, EmailsStep,BuildStep {
    private final PersonDTO person;

    public PersonBuilder() {
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
    public PhoneNumbersStep address(AddressDTO addressDto) {
        person.setAddress(addressDto);
        return this;
    }

    @Override
    public PhoneNumbersStep noAddress() {
        return this;
    }

    @Override
    public EmailsStep phoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
        person.setPhoneNumbers(phoneNumbers);
        return this;
    }

    @Override
    public EmailsStep noPhoneNumbers() {
        return this;
    }

    @Override
    public BuildStep emails(List<EmailDTO> emails) {
        person.setEmails(emails);
        return this;
    }

    @Override
    public BuildStep noEmails() {
        return this;
    }

    @Override
    public PersonDTO build() {
        return person;
    }
}
