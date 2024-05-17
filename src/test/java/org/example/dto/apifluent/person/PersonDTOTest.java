package org.example.dto.apifluent.person;

import org.example.dto.apifluent.adress.AddressDTO;
import org.example.dto.apifluent.email.EmailDTO;
import org.example.dto.apifluent.phone.PhoneNumberDTO;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonDTOTest {

    @Test
    void devraitConstruirePersonneAvecTousLesChamps() {
        AddressDTO address = AddressDTO.builder().street("123 Main St").city("Springfield").state("IL").zip("62701").build();
        List<PhoneNumberDTO> phoneNumbers = new ArrayList<>();
        phoneNumbers.add(PhoneNumberDTO.builder().number("1234567890").build());
        List<EmailDTO> emails = new ArrayList<>();
        emails.add(EmailDTO.builder().email("john.doe@example.com").build());

        PersonDTO person = PersonDTO.builder()
            .firstName("John")
            .lastName("Doe")
            .birthDate(LocalDate.of(1990, 1, 1))
            .address(address)
            .phoneNumbers(phoneNumbers)
            .emails(emails)
            .build();

        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getLastName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getAddress()).isEqualTo(address);
        assertThat(person.getPhoneNumbers()).isEqualTo(phoneNumbers);
        assertThat(person.getEmails()).isEqualTo(emails);
    }

    @Test
    void devraitConstruirePersonneSansNumerosDeTelephoneEtEmails() {
        AddressDTO address = AddressDTO.builder().street("123 Main St").city("Springfield").state("IL").zip("62701").build();

        PersonDTO person = PersonDTO.builder()
            .firstName("John")
            .lastName("Doe")
            .birthDate(LocalDate.of(1990, 1, 1))
            .address(address)
            .noPhoneNumbers()
            .noEmails()
            .build();

        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getLastName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getAddress()).isEqualTo(address);
        assertThat(person.getPhoneNumbers()).isNull();
        assertThat(person.getEmails()).isNull();
    }
    @Test
    void devraitConstruirePersonneSansAdresseSansNumerosDeTelephoneEtEmails() {


        PersonDTO person = PersonDTO.builder()
                .firstName("John")
                .lastName("Doe")
                .birthDate(LocalDate.of(1990, 1, 1))
                .noAddress()
                .noPhoneNumbers()
                .noEmails()
                .build();

        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getLastName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getAddress()).isNull();
        assertThat(person.getPhoneNumbers()).isNull();
        assertThat(person.getEmails()).isNull();
    }
}
