package JavaBasicsLab.S04_05_S06.Homework;

public class Main {
    public static void main(String[] args) {
        ShopItem ouaDeGaina = new ShopItem("oua", "Oua De Gaina", "O-001", 0.82);
        ShopItem ouaDePrepelita = new ShopItem("oua", "Oua De Prepelita", "O-002", 1.44);
        ShopItem carneDeVita = new ShopItem("carne", "Carne De Vita", "C-001", 8.21);
        ShopItem zahar = new ShopItem("Ingrediente", "Zahar", "I-001", 4.00);

        Inventory magazin1 = new Inventory("Magazin 1");
        CashRegister tillMagazin1 = new CashRegister("mag1-till1", "RON", 10000);
        ShoppingCart cos = new ShoppingCart("cos", magazin1, tillMagazin1);

        magazin1.addToStock(ouaDeGaina, 30);
        magazin1.addToStock(ouaDePrepelita, -3);
        magazin1.addToStock(ouaDePrepelita, 6);
        magazin1.printStock();
        magazin1.purgeFromStock(ouaDePrepelita);
        magazin1.addToStock(carneDeVita, 10);
        magazin1.addToStock(zahar, 23);
        System.out.println(magazin1.isInStock(ouaDePrepelita));
        magazin1.printStock();
        magazin1.addToStock(zahar, 23);
        magazin1.printStock();
        magazin1.removeFromStock(zahar, 46);
        magazin1.printStock();
        magazin1.removeFromStock(zahar, 2);


        cos.addToStock(ouaDeGaina, 3);
        System.out.println(cos.returnTotalPrice());
        cos.buyShoppingCart();

        System.out.println("Magazin:");
        magazin1.printStock();
        System.out.println(tillMagazin1.getAvailableAmount());
    }
}
