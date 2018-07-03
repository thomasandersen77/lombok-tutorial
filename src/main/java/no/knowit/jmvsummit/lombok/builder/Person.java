package no.knowit.jmvsummit.lombok.builder;

import lombok.*;

import java.time.LocalDate;

@ToString
@Getter
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Person {
    private String firstname;
    private String middlename;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstname("thomas")
                .middlename("")
                .lastname("andersen")
                .birthdate(LocalDate.of(2000, 1, 1))
                .build();   
        
        System.out.println(person);
    }
}