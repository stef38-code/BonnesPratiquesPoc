package org.example.dto.buidler;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.Collections;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class PersonDTOTest {
    @Test
    @DisplayName("Check PersonDTO Builder and Getters")
    void checkPersonDTOBuilderAndGetters() {
        PersonDTO person = PersonDTO.builder()
                .firstName("John")
                .lastName("Doe")
                .birthDate(LocalDate.of(1990, 1, 1))
                .spouse(
                        PersonDTO.builder()
                                .firstName("Jane")
                                .lastName("Doe")
                                .birthDate(LocalDate.of(1990, 1, 1))
                                .build()
                )
                .address(
                        AddressDTO.builder()
                                .street("1234 Main St")
                                .city("Springfield")
                                .state("IL")
                                .zip("62701")
                                .build()
                )
                .phoneNumbers(Collections.singletonList(
                        PhoneNumberDTO.builder()
                                .number("217-555-5555")
                                .build()
                ))
                .emails(Collections.singletonList(
                        EmailDTO.builder()
                                .email("John.doe@toto.com")
                                .build()
                ))
                .build();
        assertThat(person.getFirstName()).isEqualTo("John");
        assertThat(person.getLastName()).isEqualTo("Doe");
        assertThat(person.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));
        assertThat(person.getSpouse()).isNotNull();
        PersonDTO spouse = person.getSpouse();
        assertThat(spouse.getFirstName()).isEqualTo("Jane");
        assertThat(spouse.getLastName()).isEqualTo("Doe");
        assertThat(spouse.getBirthDate()).isEqualTo(LocalDate.of(1990, 1, 1));

        assertThat(person.getAddress()).isNotNull();
        AddressDTO address = person.getAddress();
        assertThat(address.getStreet()).isEqualTo("1234 Main St");
        assertThat(address.getCity()).isEqualTo("Springfield");
        assertThat(address.getState()).isEqualTo("IL");
        assertThat(address.getZip()).isEqualTo("62701");

        assertThat(person.getPhoneNumbers()).hasSize(1);
        PhoneNumberDTO phoneNumberDTO = person.getPhoneNumbers().get(0);
        assertThat(phoneNumberDTO.getNumber()).isEqualTo("217-555-5555");

        assertThat(person.getEmails()).hasSize(1);
        EmailDTO emailDTO = person.getEmails().get(0);
        assertThat(emailDTO.getEmail()).isEqualTo("John.doe@toto.com");
    }
}
