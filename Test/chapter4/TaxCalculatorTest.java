package chapter4;

import chapter4.TaxCalculator.Citizen;
import chapter4.TaxCalculator.TaxCalculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

public class TaxCalculatorTest {

    private TaxCalculator calculator;
    private Citizen mathias;
    private Citizen dewunmi;
    private Citizen deola;

    @BeforeEach
    public void setUp() {
        mathias = new Citizen();
        mathias.setFirstname("Mathias");
        mathias.setSurname("Momodu");
        mathias.setEarnings(new BigDecimal(17000));

        dewunmi = new Citizen("Adewunmi", "Adegunwa");
        dewunmi.setEarnings(BigDecimal.valueOf(25000));

        deola = new Citizen("Adeola", "Adekunle", BigDecimal.valueOf(45000));

    }

    @Test
    public void calculateTax() {
        BigDecimal mathiasTax = TaxCalculator.calculateTax(mathias);
        assertEquals(2550.00, mathiasTax.intValue());

        BigDecimal dewunmiTax = TaxCalculator.calculateTax(dewunmi);
        assertEquals(3750.00, dewunmiTax.intValue());
    }

    @Test
    public void calculateExcessTax() {
        BigDecimal deolaTax = TaxCalculator.calculateTax(deola);
        assertEquals(7500.00, deolaTax.intValue());
    }
}
