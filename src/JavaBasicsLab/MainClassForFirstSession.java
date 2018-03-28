package JavaBasicsLab;

import static java.lang.Math.pow;

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


        // Homework JavaBasics Session2
        sumTwoNumbers(1, 2);
        subtractTwoNumbers(100, 91);
        divideTwoNumbers(7, 3);
        multiplyTwoNumbers(5, 7);

        //V1
        for (int i=1; i<=10; i++){
            xToThePowerOfY(2, i);
        }

        //V2
        xToThePowerOfYLoop(2, 10);



    }

    private static void printare() {
        System.out.println("Iteratia Numarul : 1");
        System.out.println("Iteratia Numarul : 2");
        System.out.println("Iteratia Numarul : 3");
    }

    private static void printeazaValoareaLuiX(int x) {

        System.out.println("X este: " + x);

    }

    private static int sumTwoNumbers(int num1, int num2){

        int sum = num1 + num2;

        System.out.println("Suma numerelor este: " + sum);

        return sum;
    }

    private static int subtractTwoNumbers(int num1, int num2){

        int difference = num1 - num2;

        System.out.println("Diferenta dintre cele doua numere este: " + difference);

        return difference;
    }

    private static double divideTwoNumbers(int num1, int num2){

        double division = num1 / num2;

        System.out.println("Impartirea numerelor este: " + division);

        return division;
    }

    private static int multiplyTwoNumbers(int num1, int num2){

        int multiplication = num1 * num2;

        System.out.println("Inmultirea numerelor este: " + multiplication);

        return multiplication;
    }

    private static int xToThePowerOfY(int x, int y){

        //We are not in Python anymore, Toto...
        //int result = x ^ y;

        Double operation = pow(x, y);
        int result = operation.intValue();

        System.out.println(x + " la puterea lui " + y + " este: " + result);

        return result;
    }

    private static int xToThePowerOfYLoop(int x, int y){

        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        System.out.println(x + " la puterea lui " + y + " este: " + result);

        return result;
    }





}