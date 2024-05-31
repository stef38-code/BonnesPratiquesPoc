package org.example.dto.record.fluent.personne;

import org.example.dto.record.fluent.adresse.AddressDTO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.assertj.core.api.Assertions.assertThat;

class PersonDTOTest {

    /**
     * Teste la construction d'une instance de PersonDTO à l'aide du builder.
     */
    @Test
    void constructionPersonneAvecBuilder() {
        AddressDTO adresse = AddressDTO.builder()
                .rue("123 Main St")
                .ville("Springfield")
                .pays("IL")
                .codePostal("62701")
                .construire();
        PersonDTO personne = PersonDTO.builder()
                .prenom("John")
                .nom("Doe")
                .dateNaiss(LocalDate.of(1990, 1, 1))
            .adresse(adresse)
            .construire();

        assertThat(personne).isNotNull();
        assertThat(personne.prenom()).isEqualTo("John");
        assertThat(personne.nom()).isEqualTo("Doe");
        assertThat(personne.dateNaiss()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(personne.adresse()).usingRecursiveComparison()
                .isEqualTo(adresse);
    }
    /**
     * Teste la construction d'une instance de PersonDTO sans adresse à l'aide du builder.
     */
    @Test
    void constructionPersonneSansAdresseAvecBuilder() {
        PersonDTO personne = PersonDTO.builder()
                .prenom("John")
                .nom("Doe")
                .dateNaiss(LocalDate.of(1990, 1, 1))
                .sansAdresse()
                .construire();

        assertThat(personne).isNotNull();
        assertThat(personne.prenom()).isEqualTo("John");
        assertThat(personne.nom()).isEqualTo("Doe");
        assertThat(personne.dateNaiss()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(personne.adresse()).isNull();
    }
}
