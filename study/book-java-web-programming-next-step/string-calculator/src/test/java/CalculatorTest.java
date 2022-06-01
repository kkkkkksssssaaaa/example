import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    public void add() {
        Calculator cal = new Calculator();
        System.out.println(cal.add(3, 4));
    }

    @Test
    public void subtract() {
        Calculator cal = new Calculator();
        System.out.println(cal.subtract(5, 4));
    }

    @Test
    public void multiply() {
        Calculator cal = new Calculator();
        System.out.println(cal.multiply(2, 6));
    }

    @Test
    public void divide() {
        Calculator cal = new Calculator();
        System.out.println(cal.divide(8, 4));
    }

}