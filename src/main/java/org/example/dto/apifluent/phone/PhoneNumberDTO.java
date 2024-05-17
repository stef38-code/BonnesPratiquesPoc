package org.example.dto.apifluent.phone;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter public class PhoneNumberDTO {
    private String number;

    PhoneNumberDTO() {
    }

    public static NumberStep builder() {
        return new PhoneNumberBuilder();
    }

    // getters and setters
}

