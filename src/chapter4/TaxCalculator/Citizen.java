package chapter4.TaxCalculator;

import java.math.BigDecimal;

public class Citizen {
    private String firstName;
    private String surname;
    private BigDecimal income;

    public Citizen() {
    }

    public Citizen(String firstName, String surname) {
        this.firstName = firstName;
        this.surname = surname;

    }

    public Citizen(String firstName, String surname, BigDecimal income) {
        this(firstName, surname);
        this.income = income;
    }

    public void setFirstname(String firstName) {
        this.firstName = firstName;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setEarnings(BigDecimal income) {
        this.income = income;
    }

    public BigDecimal getEarnings() {
        return income;
    }
}
