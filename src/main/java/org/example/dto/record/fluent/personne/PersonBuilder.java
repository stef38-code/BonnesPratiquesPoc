package org.example.dto.record.fluent.personne;

import org.example.dto.record.fluent.adresse.AddressDTO;
import org.example.dto.record.fluent.adresse.AddressStep;

import java.time.LocalDate;

public class PersonBuilder implements FirstNameStep, LastNameStep, BirthDateStep, AddressStep, PersonneBuildStep {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private AddressDTO address;

    @Override
    public LastNameStep prenom(String firstName) {
        this.firstName = firstName;
        return this;
    }

    @Override
    public BirthDateStep nom(String lastName) {
        this.lastName = lastName;
        return this;
    }

    @Override
    public AddressStep dateNaiss(LocalDate birthDate) {
        this.birthDate = birthDate;
        return this;
    }

    @Override
    public PersonneBuildStep adresse(AddressDTO address) {
        this.address = address;
        return this;
    }

    @Override
    public PersonneBuildStep sansAdresse() {
        this.address = null;
        return this;
    }

    @Override
    public PersonDTO construire() {
        return new PersonDTO(firstName, lastName, birthDate, null, address, null, null);
    }
}





