package JavaBasicsLab.S04.Homework;

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

    public double getAvailableAmount() {
        return availableAmount;
    }

    public void sellShopItems() {
        //TODO
    }
}
