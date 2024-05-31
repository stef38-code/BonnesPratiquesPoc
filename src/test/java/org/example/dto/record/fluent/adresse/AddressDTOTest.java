package org.example.dto.record.fluent.adresse;



import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class AddressDTOTest {

    /**
     * Teste la construction d'une instance de AddressDTO à l'aide du builder.
     */
    @Test
     void constructionAdresseAvecBuilder() {
        AddressDTO adresse = AddressDTO.builder().rue("123 Main St").ville("Springfield").pays("IL").codePostal("62701").construire();

        assertThat(adresse).isNotNull();
        assertThat(adresse.rue()).isEqualTo("123 Main St");
        assertThat(adresse.ville()).isEqualTo("Springfield");
        assertThat(adresse.pays()).isEqualTo("IL");
        assertThat(adresse.codePostal()).isEqualTo("62701");
    }
}
