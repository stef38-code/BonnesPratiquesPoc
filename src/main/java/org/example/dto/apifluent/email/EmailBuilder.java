package org.example.dto.apifluent.email;

public class EmailBuilder implements EmailStep, BuildStep {
    private String email;

    @Override
    public BuildStep email(String email) {
        this.email = email;
        return this;
    }

    @Override
    public EmailDTO build() {
        EmailDTO emailDto = new EmailDTO();
        emailDto.setEmail(email);
        return emailDto;
    }
}
