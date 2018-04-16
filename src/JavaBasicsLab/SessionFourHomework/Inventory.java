package JavaBasicsLab.SessionFourHomework;

import java.util.LinkedHashMap;
import java.util.Map;

public class Inventory {
    private String name;
    private Map<ShopItem, Integer> stock = new LinkedHashMap<>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Inventory(String name) {
        this.name = name;
    }

    public void addToStock(ShopItem si, int amount) {
        if(!(amount<0)) {
            if (isInStock(si)) {
                stock.replace(si, stock.get(si) + amount);
            } else {
                stock.put(si, amount);
            }
        } else {
            System.out.println("Invalid amount. Amount must be greater or equal to 0");
        }
    }

    public void removeFromStock(ShopItem si, int amount){
        if(isInStock(si)){
            if ((stock.get(si)) < amount){
                stock.replace(si, amount);
            } else {
                System.out.println(String.format("The amount entered <enteredAmount: %s> is greater than the available" +
                        " stock amount <existingAmount: %s> for the %s Shop Item. No remove action was performed.",
                        amount, stock.get(si), si.getName()));
            }
        } else {
            System.out.println("Shop Item " + si.getName() + " is not in stock");
        }
    }

    public boolean isInStock(ShopItem si) {
        return stock.containsKey(si);
    }

    public void printStock() {
        System.out.println("---------");
        for (Map.Entry<ShopItem, Integer> entry : stock.entrySet()) {
            System.out.println(entry.getKey().getName() + " / " + entry.getValue());
        }
        System.out.println("---------");
    }
}
