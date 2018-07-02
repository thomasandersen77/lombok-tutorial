package no.knowit.jmvsummit.lombok.equalsAndHashcode;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDate;

@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstname("")
                .lastname("")
                .birthdate(LocalDate.MAX)
                .build();
        System.out.println(person);
    }
}