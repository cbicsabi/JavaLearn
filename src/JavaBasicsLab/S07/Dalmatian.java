package JavaBasicsLab.S07;

public class Dalmatian extends Caine{
    boolean pete = true;

    @Override
    public void latra() {
        System.out.println("WOOOOOOF!");
    }

    public void latra(String s) {
        System.out.println("WOOOOOOFF!");
    }

    public void joacaInFilme() {
        System.out.println(this.nume + "Joaca in Filme");
    }
}
