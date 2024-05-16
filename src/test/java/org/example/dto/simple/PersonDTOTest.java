package org.example.dto.simple;

import org.exemple.utils.JsonUtil;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class PersonDTOTest {

    @Test
    void testConvertJsonFileToClass() throws IOException {
        // Convert the JSON file to a List of PersonDTO
        List<PersonDTO> persons = JsonUtil.convertJsonFileToList("personneDto.json", PersonDTO.class);

        // Check the size of the list
        assertThat(persons).hasSize(4);

        // Check the values of the first person
        PersonDTO jean = persons.get(0);
        assertThat(jean.getFirstName()).isEqualTo("Jean");
        assertThat(jean.getLastName()).isEqualTo("Dupont");
        // ... continue with other assertions for the rest of the attributes

        // Check the values of the second person
        PersonDTO pierre = persons.get(1);
        assertThat(pierre.getFirstName()).isEqualTo("Pierre");
        assertThat(pierre.getLastName()).isEqualTo("Martin");
        // ... continue with other assertions for the rest of the attributes

        // Continue with similar checks for the rest of the persons in the list
    }
}
