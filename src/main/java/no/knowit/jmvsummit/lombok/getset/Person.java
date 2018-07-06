package no.knowit.jmvsummit.lombok.getset;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname("thomas");
        person.setLastname("andersen");
        person.setBirthdate(LocalDate.of(2000, 1, 1));

        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.getBirthdate());
    }
}