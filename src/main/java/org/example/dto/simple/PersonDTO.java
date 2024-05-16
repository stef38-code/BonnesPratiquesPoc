package org.example.dto.simple;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.time.LocalDate;
import java.util.List;

@JsonRootName(value = "personne")
public class PersonDTO {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private PersonDTO spouse;
    private AddressDTO address;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<EmailDTO> emails;

    public PersonDTO(AddressDTO address,
                     LocalDate birthDate,
                     List<EmailDTO> emails,
                     String firstName,
                     String lastName,
                     List<PhoneNumberDTO> phoneNumbers,
                     PersonDTO spouse) {

        this.address = address;
        this.birthDate = birthDate;
        this.emails = emails;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumbers = phoneNumbers;
        this.spouse = spouse;
    }
// getters and setters

    public AddressDTO getAddress() {
        return address;
    }

    public void setAddress(AddressDTO address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public List<EmailDTO> getEmails() {
        return emails;
    }

    public void setEmails(List<EmailDTO> emails) {
        this.emails = emails;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<PhoneNumberDTO> getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    public PersonDTO getSpouse() {
        return spouse;
    }

    public void setSpouse(PersonDTO spouse) {
        this.spouse = spouse;
    }
}

