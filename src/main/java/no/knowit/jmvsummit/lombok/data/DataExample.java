package no.knowit.jmvsummit.lombok.data;

import static org.junit.Assert.assertEquals;

import java.time.LocalDate;

import lombok.Data;

@Data
public class DataExample {
    private String firstname;
    private String lastname;
    private LocalDate birthdate;
}

class Main {
    public static void main(String[] args) {
        DataExample dataExample = new DataExample();
        dataExample.setBirthdate(LocalDate.MAX);
        dataExample.setFirstname("thomas");
        dataExample.setLastname("andersen");


        DataExample dataExample2 = new DataExample();
        dataExample2.setBirthdate(LocalDate.MAX);
        dataExample2.setFirstname("thomas");
        dataExample2.setLastname("andersen");

        assertEquals(dataExample, dataExample2);
    }
}