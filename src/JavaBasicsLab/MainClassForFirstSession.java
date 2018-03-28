package JavaBasicsLab;

public class MainClassForFirstSession {

    public static void main(String[] args) {
        int numarulMeu = 12;
        int numarulTau = 20;

        int suma = numarulMeu + numarulTau;
        String descriere = "Suma celor doua numere este: ";
        String descriere2 = "bla bla";
        String concatenare = descriere + descriere2;

        System.out.println(concatenare);
        System.out.println(suma);
        printare();

        for (int i = 0; i <= 1000; i=i+100) {

          System.out.println("Iteratia Numarul : " + i);

        }

        int x = 0;    //initializare

        while (x < 6) {

            printeazaValoareaLuiX(x);

            int restulImpartirii = x % 2;

            if (restulImpartirii == 0) {

                System.out.println("Numarul par este : " + x);

            }
            else {
                if (restulImpartirii == 1) {
                    System.out.println("Am intrat pe ramura 2 de IF : " + x);
                }
            }

            System.out.println("--------------");

            x++;

        }

        printare();

    }

    private static void printare() {
        System.out.println("Iteratia Numarul : 1");
        System.out.println("Iteratia Numarul : 2");
        System.out.println("Iteratia Numarul : 3");
    }

    public static void printeazaValoareaLuiX(int y) {

        System.out.println("X este: " + y);

    }

}