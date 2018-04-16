package JavaBasicsLab.SessionFourHomework;

import java.util.LinkedHashMap;
import java.util.Map;

public class ShoppingCart {
    private String name;
    private Map<ShopItem, Integer> shoppingCart = new LinkedHashMap<>();

    public void addToStock(ShopItem si, int amount) {
        if(!(amount<0)) {
            if(isInShoppingCart(si)){
                shoppingCart.replace(si, shoppingCart.get(si)+amount);
            } else {
                shoppingCart.put(si, amount);
            }
        } else {
            System.out.println("Invalid amount. Amount must be greater or equal to 0");
        }
    }

    public void removeFromStock(ShopItem si, int amount){
        if(isInShoppingCart(si)){
            if (shoppingCart.get(si) < amount){
                shoppingCart.replace(si, amount);
            } else {
                System.out.println(String.format("The amount entered <enteredAmount: %s> is greater than the available" +
                    " shoppingCart amount <existingAmount: %s> for the %s Shop Item. No remove action was performed.",
                    amount, shoppingCart.get(si), si.getName()));
            }
        } else {
            System.out.println("Shop Item " + si.getName() + " is not in shoppingCart");
        }
    }

    public boolean isInShoppingCart(ShopItem si){
        return shoppingCart.containsKey(si);
    }
}
