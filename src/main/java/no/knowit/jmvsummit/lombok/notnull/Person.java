package no.knowit.jmvsummit.lombok.notnull;

import lombok.*;

import java.time.LocalDate;

@Getter
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {
    private @NonNull String firstname;
    private @NonNull String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = new Person("thomas", "andersen", LocalDate.of(2000, 1, 1));

        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.getBirthdate());
    }
}