package org.example.dto.buidler;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class AddressDTO {
    private String street;
    private String city;
    private String state;
    private String zip;


}
