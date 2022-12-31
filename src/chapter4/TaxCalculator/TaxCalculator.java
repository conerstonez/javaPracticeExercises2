package chapter4.TaxCalculator;

import java.math.BigDecimal;

public class TaxCalculator {

    private static final BigDecimal MINIMUM_EARNING = BigDecimal.valueOf(30000);
    private static final double BASE_TAX_RATE = 0.15;
    private static final double ADDITIONAL_TAX_RATE = 0.20;


    public static BigDecimal calculateTax(Citizen citizen) {
        BigDecimal taxAmount = citizen.getEarnings().multiply(BigDecimal.valueOf(BASE_TAX_RATE));
        if (citizen.getEarnings().compareTo(MINIMUM_EARNING)  > 0) {
            BigDecimal excessAmount = citizen.getEarnings().subtract(MINIMUM_EARNING);
            BigDecimal baseTax = MINIMUM_EARNING.multiply(BigDecimal.valueOf(BASE_TAX_RATE));
            BigDecimal excessTax = excessAmount.multiply(BigDecimal.valueOf(ADDITIONAL_TAX_RATE));
            taxAmount = excessTax.add(baseTax);
        }
        return taxAmount;
    }
}
