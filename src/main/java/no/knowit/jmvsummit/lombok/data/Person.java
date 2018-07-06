package no.knowit.jmvsummit.lombok.data;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname("thomas");
        person.setBirthdate(LocalDate.of(1977, 1, 1));

        System.out.println(person.getFirstname());
        System.out.println(person.getLastname());
        System.out.println(person.hashCode());
    }
}