package org.example.dto.apifluent.person;



import lombok.Getter;
import lombok.Setter;
import org.example.dto.apifluent.email.EmailDTO;
import org.example.dto.apifluent.adress.AddressDTO;
import org.example.dto.apifluent.phone.PhoneNumberDTO;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
public class PersonDTO {
    private String firstName;
    private String lastName;
    private LocalDate birthDate;
    private PersonDTO spouse;
    private AddressDTO address;
    private List<PhoneNumberDTO> phoneNumbers;
    private List<EmailDTO> emails;

    PersonDTO() {
        // comment explaining why the method is empty
    }
    public static FirstNameStep builder() {
        return new PersonBuilder();
    }


}

