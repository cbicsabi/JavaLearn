package JavaBasicsLab.S04_05_S06.Homework;

public class CashRegister {
    private String name;
    private String currency;
    private double availableAmount;

    public CashRegister(String name, String currency, double availableAmount) {
        this.name = name;
        this.currency = currency;
        this.availableAmount = availableAmount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    protected double getAvailableAmount() {
        return availableAmount;
    }

    protected void creditAvailableAmount(double amount) {
        this.availableAmount += amount;
    }

    public void debitAvailableAmount(double amount) {
        this.availableAmount -= amount;
    }
}
