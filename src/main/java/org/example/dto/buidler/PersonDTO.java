package org.example.dto.buidler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
public class PersonDTO {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private PersonDTO spouse;
    private AddressDTO address;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<EmailDTO> emails;

}
