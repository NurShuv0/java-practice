class Number {
    protected int value;
    public Number(int value) {
        this.value = value;
    }
    public void showValue() {
        System.out.println("Decimal: " + value);
    }
}
class outhex extends Number {
    public outhex(int value) {
        super(value);
    }
    @Override
    public void showValue() {
        System.out.println("Hexadecimal: " + Integer.toHexString(value).toUpperCase());
    }
}
class outoct extends Number {
    public outoct(int value) {
        super(value);
    }
    @Override
    public void showValue() {
        System.out.println("Octal: " + Integer.toOctalString(value));
    }
}
public class Number_system {
    public static void main(String[] args) {
        int number = 639;
        Number decimal = new Number(number);
        outhex hex = new outhex(number);
        outoct oct = new outoct(number);
        decimal.showValue();
        hex.showValue();
        oct.showValue();
    }
}