package org.example.dto.apifluent.person;

import org.example.dto.apifluent.phone.PhoneNumberDTO;

import java.util.List;


public interface PhoneNumbersStep {
    EmailsStep phoneNumbers(List<PhoneNumberDTO> phoneNumbers);
    EmailsStep noPhoneNumbers();
}


