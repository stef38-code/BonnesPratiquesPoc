package org.example.dto.apifluent.person;

import org.example.dto.apifluent.email.EmailDTO;

import java.util.List;

public interface EmailsStep {
    BuildStep emails(List<EmailDTO> emails);
    BuildStep noEmails();
}
