package JavaBasicsLab.SessionFourHomework;

public class Main {
    public static void main(String[] args) {
        ShopItem ouaDeGaina = new ShopItem("oua", "Oua De Gaina", "O-001", 0.82);
        ShopItem ouaDePrepelita = new ShopItem("oua", "Oua De Prepelita", "O-002", 1.44);
        ShopItem carneDeVita = new ShopItem("carne", "Carne De Vita", "C-001", 8.21);
        ShopItem zahar = new ShopItem("Ingrediente", "Oua De Prepelita", "I-001", 4.00);

        Inventory magazin1 = new Inventory("Magazin 1");
        magazin1.addToStock(ouaDeGaina, 30);
        magazin1.addToStock(ouaDePrepelita, -3);
        magazin1.addToStock(ouaDePrepelita, 6);
        magazin1.addToStock(carneDeVita, 10);
        magazin1.addToStock(zahar, 23);
        System.out.println(magazin1.isInStock(ouaDePrepelita));
        magazin1.printStock();
        magazin1.addToStock(zahar, 23);
        magazin1.printStock();
        magazin1.removeFromStock(zahar, 26);
        magazin1.printStock();
        magazin1.removeFromStock(zahar, 2);
    }
}
