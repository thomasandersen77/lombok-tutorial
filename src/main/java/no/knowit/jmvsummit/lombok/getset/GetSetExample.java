package no.knowit.jmvsummit.lombok.getset;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GetSetExample {
    private String field1;
    private String field2;
    private String field3;
}

class Main {
    public static void main(String[] args) {
        GetSetExample example = new GetSetExample();
        example.setField1("field1");
        example.setField2("field2");
        example.setField3("field3");

        System.out.println(example.getField1());
        System.out.println(example.getField2());
        System.out.println(example.getField3());
    }
}