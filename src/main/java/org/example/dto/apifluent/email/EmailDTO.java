package org.example.dto.apifluent.email;

import lombok.Getter;
import lombok.Setter;

@Setter @Getter
public class EmailDTO {
    private String email;


    EmailDTO() {

    }

    public static EmailStep builder() {
        return new EmailBuilder();
    }

}
