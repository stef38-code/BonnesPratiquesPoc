package org.example.dto.apifluent;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonDTOTest {
@Test
    void create(){
   PersonDTO person = PersonDTO.builder()
    .firstName("John")
    .lastName("Doe")
    .birthDate(LocalDate.of(1990, 1, 1))
    .address(new AddressBuilder().street("123 Main St").city("Springfield").state("IL").zip("62701").build())
    .build();
}
}
