package no.knowit.jmvsummit.lombok.data;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Person {
    private String firstname;
    private String middlename;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstname("");
        person.setLastname("");
        person.setMiddlename("");
        person.setBirthdate(LocalDate.MAX);
        System.out.println(person);
    }
}