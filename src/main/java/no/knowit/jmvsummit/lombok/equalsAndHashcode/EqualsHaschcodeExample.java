package no.knowit.jmvsummit.lombok.equalsAndHashcode;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(of = {"var1", "var2"})
@Data
public class EqualsHaschcodeExample {
    private String var1;
    private String var2;
    private String var3;
    private String var4;
}

class Main {
    public static void main(String[] args) {
        EqualsHaschcodeExample example = new EqualsHaschcodeExample();
        example.setVar1("1");
        example.setVar2("2");
        example.setVar3("3");
        example.setVar4("4");

        System.out.println(example);
    }
}