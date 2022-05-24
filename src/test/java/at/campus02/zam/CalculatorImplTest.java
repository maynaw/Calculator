package at.campus02.zam;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorImplTest {
    private Calculator calc;
    // is executed before each test: use it to initalize data
    @BeforeEach
    void setup(){
        // SETUP PHASE
        calc = new CalculatorImpl();
    }
    @Test
    void should_add_two_numbers(){
        // Exercisse phase
        double sol = calc.add(42,68);

        //verify phase
        Assertions.assertEquals(110, sol);
    }
}
