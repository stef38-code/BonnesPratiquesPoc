package org.example.dto.record.fluent.personne;

import org.example.dto.record.fluent.email.EmailDTO;
import org.example.dto.record.fluent.adresse.AddressDTO;
import org.example.dto.record.fluent.phone.PhoneNumberDTO;

import java.time.LocalDate;
import java.util.List;

public record PersonDTO(String prenom, String nom, LocalDate dateNaiss, PersonDTO epoux, AddressDTO adresse, List<PhoneNumberDTO> telephones, List<EmailDTO> emails) {
    public static FirstNameStep builder() {
        return new PersonBuilder();
    }
}

