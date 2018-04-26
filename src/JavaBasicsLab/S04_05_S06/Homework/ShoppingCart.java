package JavaBasicsLab.S04_05_S06.Homework;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Map;

import static java.lang.Math.round;

public class ShoppingCart extends Inventory {
    private Inventory inventory;
    private CashRegister cashRegister;

    public ShoppingCart(String name, Inventory inventory, CashRegister cashRegister) {
        super(name);
        this.inventory = inventory;
        this.cashRegister = cashRegister;
    }

    public double returnTotalPrice(){
        double pretTotal = 0;
        for (Map.Entry<ShopItem, Integer> entry : stock.entrySet()) {
            pretTotal += entry.getKey().getPrice() * entry.getValue();
        }
        //TODO why doesn't it return rounded value to the second decimal???
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        double rounded = Double.parseDouble(df.format(pretTotal));
        return pretTotal;
    }

    public void buyShoppingCart(){
        for (Map.Entry<ShopItem, Integer> entry : stock.entrySet()) {
            if (this.inventory.isInStock(entry.getKey())){
                this.inventory.removeFromStock(entry.getKey(), entry.getValue());
                if (!(this.inventory.stock.get(entry.getKey()) < entry.getValue())){
                    this.cashRegister.creditAvailableAmount(entry.getKey().getPrice() * entry.getValue());
                    this.stock.remove(entry.getKey());
                }
            }
        }
    }
}
