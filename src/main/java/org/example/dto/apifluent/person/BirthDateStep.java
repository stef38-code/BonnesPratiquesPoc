package org.example.dto.apifluent.person;

import java.time.LocalDate;

public interface BirthDateStep {
    AddressStep birthDate(LocalDate birthDate);
}
