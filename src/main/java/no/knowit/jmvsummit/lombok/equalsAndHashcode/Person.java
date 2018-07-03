package no.knowit.jmvsummit.lombok.equalsAndHashcode;

import lombok.*;
import org.junit.Assert;

import java.time.LocalDate;

@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor(access = AccessLevel.PUBLIC)
public class Person {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setFirstname("thomas");
        person1.setLastname("andersen");
        person1.setBirthdate(LocalDate.of(2000, 1, 1));

        Person person2 = new Person();
        person2.setFirstname("thomas");
        person2.setLastname("andersen");
        person2.setBirthdate(LocalDate.of(2000, 1, 1));

        Assert.assertEquals(person1, person2);
    }
}