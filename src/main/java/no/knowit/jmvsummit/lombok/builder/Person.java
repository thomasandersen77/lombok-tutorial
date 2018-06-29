package no.knowit.jmvsummit.lombok.builder;

import java.time.LocalDate;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

//@ToString
@Builder
@Getter
public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
    private Address address;
}

class Main {
    public static void main(String[] args) {
        Address address = Address.builder()
                .city("Oslo")
                .country("Norway")
                .zipcode("0101")
                .build();
        Person person = Person.builder()
                .firstname("")
                .lastname("")
                .birthdate(LocalDate.MAX)
                .address(address)
                .build();
        System.out.println(person);
    }
}