package org.example.dto.apifluent.phone;

public class PhoneNumberBuilder implements NumberStep, BuildStep {
    private String number;

    @Override
    public BuildStep number(String number) {
        this.number = number;
        return this;
    }

    @Override
    public PhoneNumberDTO build() {
        PhoneNumberDTO phoneNumber = new PhoneNumberDTO();
        phoneNumber.setNumber(this.number);
        return phoneNumber;
    }
}
