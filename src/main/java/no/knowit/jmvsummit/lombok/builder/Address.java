package no.knowit.jmvsummit.lombok.builder;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Address {
    private String street;
    private String city;
    private String zipcode;
    private String country;
}
