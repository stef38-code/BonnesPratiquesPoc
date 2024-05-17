package org.example.dto.apifluent.adress;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressDTO {
    private String street;
    private String city;
    private String state;
    private String zip;
    AddressDTO() {

    }
    public static StreetStep builder() {
        return new AddressBuilder();
    }

}
