package org.example.dto.apifluent.person;

import org.example.dto.apifluent.adress.AddressDTO;
import org.example.dto.apifluent.email.EmailDTO;
import org.example.dto.apifluent.phone.PhoneNumberDTO;

import java.time.LocalDate;
import java.util.List;

/**
 * La classe PersonBuilder implémente plusieurs interfaces qui représentent les différentes étapes de la construction d'un objet PersonDTO.
 * Chaque interface correspond à une méthode dans la classe PersonBuilder.
 */
public class PersonBuilder implements FirstNameStep, LastNameStep, BirthDateStep, AddressStep, PhoneNumbersStep, EmailsStep,BuildStep {
    private final PersonDTO person;

    /**
     * Constructeur de la classe PersonBuilder.
     */
    public PersonBuilder() {
        person = new PersonDTO();
    }

    /**
     * Définit le prénom de la personne.
     * @param firstName Le prénom de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public LastNameStep firstName(String firstName) {
        person.setFirstName(firstName);
        return this;
    }

    /**
     * Définit le nom de famille de la personne.
     * @param lastName Le nom de famille de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public BirthDateStep lastName(String lastName) {
        person.setLastName(lastName);
        return this;
    }

    /**
     * Définit la date de naissance de la personne.
     * @param birthDate La date de naissance de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public AddressStep birthDate(LocalDate birthDate) {
        person.setBirthDate(birthDate);
        return this;
    }

    /**
     * Définit l'adresse de la personne.
     * @param addressDto L'adresse de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public PhoneNumbersStep address(AddressDTO addressDto) {
        person.setAddress(addressDto);
        return this;
    }

    /**
     * Indique qu'aucune adresse n'est définie pour la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public PhoneNumbersStep noAddress() {
        return this;
    }

    /**
     * Définit la liste des numéros de téléphone de la personne.
     * @param phoneNumbers La liste des numéros de téléphone de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public EmailsStep phoneNumbers(List<PhoneNumberDTO> phoneNumbers) {
        person.setPhoneNumbers(phoneNumbers);
        return this;
    }

    /**
     * Indique qu'aucun numéro de téléphone n'est défini pour la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public EmailsStep noPhoneNumbers() {
        return this;
    }

    /**
     * Définit la liste des emails de la personne.
     * @param emails La liste des emails de la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public BuildStep emails(List<EmailDTO> emails) {
        person.setEmails(emails);
        return this;
    }

    /**
     * Indique qu'aucun email n'est défini pour la personne.
     * @return L'instance de PersonBuilder.
     */
    @Override
    public BuildStep noEmails() {
        return this;
    }

    /**
     * Construit l'objet PersonDTO une fois que tous les champs nécessaires ont été définis.
     * @return L'objet PersonDTO construit.
     */
    @Override
    public PersonDTO build() {
        return person;
    }
}
