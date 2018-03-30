package JavaBasicsLab;

import static java.lang.Math.pow;

public class MainClassForFirstSession {

    public static void main(String[] args) {


        int vector1[] = {1, 2, 3};
        int[] vector2 = {4, 5, 6}; //format to be used

        int[] vector3 = new int[5];

        vector3[0] = 1;
        vector3[1] = 4;
        vector3[2] = vector3[0];
        //vector3[3] = 3;
        vector3[4] = vector3[4];

        printArray(vector3);
        findMaxNumber(vector3);
    }

    private static int[] printArray(int[] arr) {

//        for (int anArr : arr) {
//            System.out.println(anArr);
//        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        return arr;
    }

    private static int findMaxNumber(int[] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Nr. maxim este: " + max);
        return max;
    }

    private static void javaSessionTwoAndThree() {
        int numarulMeu = 12;
        int numarulTau = 20;

        int suma = numarulMeu + numarulTau;

        String descriere = "Suma celor doua numere este: ";
        String descriere2 = "bla bla";
        String concatenare = descriere + descriere2;

        System.out.println(concatenare);
        System.out.println(suma);
        printare();

        for (int i = 0; i <= 1000; i = i + 100) {
            System.out.println("Iteratia Numarul : " + i);
        }

        int x = 0;    //initializare

        while (x < 6) {
            printeazaValoareaLuiX(x);
            int restulImpartirii = x % 2;
            if (restulImpartirii == 0) {
                System.out.println("Numarul par este : " + x);
            } else {
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
        divideTwoNumbers(2134, 13);
        multiplyTwoNumbers(5, 7);

        //V1
        for (int i = 1; i <= 10; i++) {
            xToThePowerOfY(2, i);
        }

        //V2
        xToThePowerOfYLoop(2, 10);


        //Java Session 3
        double y = divideTwoNumbers(3, 0);
    }

    private static void printare() {
        System.out.println("Iteratia Numarul : 1");
        System.out.println("Iteratia Numarul : 2");
        System.out.println("Iteratia Numarul : 3");
    }

    private static void printeazaValoareaLuiX(int x) {

        System.out.println("X este: " + x);

    }

    private static int sumTwoNumbers(int num1, int num2) {

        int sum = num1 + num2;

        System.out.println("Suma numerelor este: " + sum);

        return sum;
    }

    private static int subtractTwoNumbers(int num1, int num2) {

        int difference = num1 - num2;

        System.out.println("Diferenta dintre cele doua numere este: " + difference);

        return difference;
    }

    private static double divideTwoNumbers(double num1, double num2) {
        //Double division by 0 is infinity

        if (num2 == 0) {
            System.out.println("Impartirea la 0 nu poate fi rezolvata");
            return 0;
        }

        double division = num1 / num2;
        System.out.println("Impartirea numerelor este: " + division);
        return division;
    }

    private static int multiplyTwoNumbers(int num1, int num2) {

        int multiplication = num1 * num2;

        System.out.println("Inmultirea numerelor este: " + multiplication);

        return multiplication;
    }

    private static int xToThePowerOfY(int x, int y) {

        //We are not in Python anymore, Toto...
        //int result = x ^ y;

        Double operation = pow(x, y);
        int result = operation.intValue();

        System.out.println(x + " la puterea lui " + y + " este: " + result);

        return result;
    }

    private static int xToThePowerOfYLoop(int x, int y) {

        int result = 1;

        for (int i = 0; i < y; i++) {
            result *= x;
        }

        System.out.println(x + " la puterea lui " + y + " este: " + result);

        return result;
    }

}