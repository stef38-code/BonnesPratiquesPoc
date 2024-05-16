package org.example.dto.apifluent;

public interface AddressStep {
    BuildStep address(AddressBuilder addressBuilder);
    BuildStep noAddress();
}
