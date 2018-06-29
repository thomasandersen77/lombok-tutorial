package no.knowit.jmvsummit.lombok.equalsAndHashcode;

public class EqualsHaschcodeExample {
    private String var1;
    private String var2;
    private String var3;
    private String var4;

    public EqualsHaschcodeExample() {
    }

    public String getVar1() {
        return this.var1;
    }

    public String getVar2() {
        return this.var2;
    }

    public String getVar3() {
        return this.var3;
    }

    public String getVar4() {
        return this.var4;
    }

    public void setVar1(String var1) {
        this.var1 = var1;
    }

    public void setVar2(String var2) {
        this.var2 = var2;
    }

    public void setVar3(String var3) {
        this.var3 = var3;
    }

    public void setVar4(String var4) {
        this.var4 = var4;
    }

    public String toString() {
        return "EqualsHaschcodeExample(var1=" + this.getVar1() + ", var2=" + this.getVar2() + ", var3=" + this.getVar3() + ", var4=" + this.getVar4() + ")";
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof EqualsHaschcodeExample)) return false;
        final EqualsHaschcodeExample other = (EqualsHaschcodeExample) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$var1 = this.getVar1();
        final Object other$var1 = other.getVar1();
        if (this$var1 == null ? other$var1 != null : !this$var1.equals(other$var1)) return false;
        final Object this$var2 = this.getVar2();
        final Object other$var2 = other.getVar2();
        if (this$var2 == null ? other$var2 != null : !this$var2.equals(other$var2)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $var1 = this.getVar1();
        result = result * PRIME + ($var1 == null ? 43 : $var1.hashCode());
        final Object $var2 = this.getVar2();
        result = result * PRIME + ($var2 == null ? 43 : $var2.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof EqualsHaschcodeExample;
    }
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