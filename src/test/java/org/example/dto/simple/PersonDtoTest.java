package org.example.dto.simple;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonDtoTest {

    @Test
    void testConvertJsonFileToClass() {
        // Convert the JSON file to a List of PersonDTO
        PersonDTO jean = new PersonDTO();
        jean.setFirstName("Jean");
        jean.setLastName("Dupont");
        jean.setBirthDate(LocalDate.of(1982,2,2));

        AddressDTO adresse = new AddressDTO();
        adresse.setStreet("Rue de la Paix");
        adresse.setCity("Paris");
        adresse.setState("Ile-de-France");
        adresse.setZip("75000");
        jean.setAddress(adresse);

        List<PhoneNumberDTO> numeroTels = new ArrayList<>();
        PhoneNumberDTO phoneNumberDTO = new PhoneNumberDTO();
        phoneNumberDTO.setNumber("012345678");
        numeroTels.add(phoneNumberDTO);

        jean.setPhoneNumbers(numeroTels);

        List<EmailDTO> emails = new ArrayList<>();
        EmailDTO emailDTO = new EmailDTO();
        emailDTO.setEmail("jean.dupont@example.com");

        EmailDTO emailDTO2 = new EmailDTO();
        emailDTO2.setEmail("j.dupont@example.com");

        emails.add(emailDTO);
        emails.add(emailDTO2);

        jean.setEmails(emails);

        assertThat(jean.getFirstName()).isEqualTo("Jean");
        assertThat(jean.getLastName()).isEqualTo("Dupont");

    }
}
