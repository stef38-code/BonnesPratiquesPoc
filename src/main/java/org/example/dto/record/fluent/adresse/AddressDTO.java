package org.example.dto.record.fluent.adresse;

public record AddressDTO(String rue, String ville, String pays, String codePostal) {
    public static StreetStep builder() {
        return new AddressBuilder();
    }
}
