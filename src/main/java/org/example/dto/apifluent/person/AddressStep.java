package org.example.dto.apifluent.person;

import org.example.dto.apifluent.adress.AddressDTO;

public interface AddressStep {
    PhoneNumbersStep address(AddressDTO addressDto);
    PhoneNumbersStep noAddress();
}

