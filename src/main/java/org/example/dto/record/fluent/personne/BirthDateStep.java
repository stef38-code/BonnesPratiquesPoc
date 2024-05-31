package org.example.dto.record.fluent.personne;

import org.example.dto.record.fluent.adresse.AddressStep;

import java.time.LocalDate;

public interface BirthDateStep {
    AddressStep dateNaiss(LocalDate birthDate);
}
