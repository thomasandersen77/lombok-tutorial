package no.knowit.jmvsummit.lombok.notnull;

import java.util.ArrayList;
import java.util.List;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NonNull;

@Data
@AllArgsConstructor(access = AccessLevel.PUBLIC)
public class NotNullExample {
    private List<String> list;
    private @NonNull Integer number;
}

class Main {
    public static void main(String[] args) {

        NotNullExample example = new NotNullExample(new ArrayList<>(), 123);
        //NotNullExample example = new NotNullExample(new ArrayList<>(), null);

    }
}