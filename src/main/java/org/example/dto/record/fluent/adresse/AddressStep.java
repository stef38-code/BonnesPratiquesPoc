package org.example.dto.record.fluent.adresse;

import org.example.dto.record.fluent.personne.PersonneBuildStep;

public interface AddressStep {
    PersonneBuildStep adresse(AddressDTO address);

    PersonneBuildStep sansAdresse();
}
