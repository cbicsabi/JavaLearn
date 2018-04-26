package JavaBasicsLab.S07;

public class Main {
    public static void main(String[] args) {
        Caine c = new Caine();
        c.nume = "Azor";
        c.rasa = "A";

        Dalmatian d = new Dalmatian();
        d.daDinCoada();
        d.rasa = "B";

        d.latra("c");

        returnRasa(c);
        returnRasa(d);
    }

    public static String returnRasa(Caine c) {
        System.out.println(c.rasa);
        return c.rasa;
    }
}
