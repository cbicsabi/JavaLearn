package JavaBasicsLab;

import static java.lang.Math.pow;

public class MainClassForFirstSession {

    public static void main(String[] args) {


//        int vector1[] = {1, 2, 3};
//        int[] vector2 = {4, 5, 6}; //format to be used
//
//        int[] vector3 = new int[5];
//
//        vector3[0] = 1;
//        vector3[1] = 4;
//        vector3[2] = vector3[0];
//        //vector3[3] = 3;
//        vector3[4] = vector3[4];
//
//        printArray(vector3);
//        findMaxIntNumber(vector3);


        int[] array = {1, 2, 3, 4, 5, 6, 8, 9, 10, 13, 15, 18, 19, 20, 23, 25, 26, 28, 30, 34, 35, 36, 38, 39, 40};

        long startTime = System.nanoTime();
        twoNumbersEqualX1(array, 37);
        long endTime = System.nanoTime();
        long duration1 = (endTime - startTime);

        long startTime2 = System.nanoTime();
        twoNumbersEqualX2(array, 37);
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2);

        long startTime3 = System.nanoTime();
        twoNumbersEqualX3(array, 37);
        long endTime3 = System.nanoTime();
        long duration3 = (endTime3 - startTime3);

        System.out.println("Method 1: " + duration1 + "ns");
        System.out.println("Method 2: " + duration2 + "ns");
        System.out.println("Method 3: " + duration3 + "ns");


        long[] durationTimes = {duration1, duration2, duration3};


        findMinLongNumber(durationTimes);
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

    private static int findMaxIntNumber(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.println("Nr. maxim este: " + max);
        return max;
    }

    private static long findMinLongNumber(long[] arr) {
        long max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max > arr[i]) max = arr[i];
        }
        System.out.println("Nr. minim este: " + max);
        return max;
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

    private static boolean twoNumbersEqualX1(int[] arr, int sumaDorita) {
        int sumaCurenta;
        for (int i : arr) {
            for (int j : arr) {
                sumaCurenta = i + j;
                if (sumaCurenta == sumaDorita) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean gasesteNumar(int[] arr, int numarCeTrebuieCautat) {
        for (int i : arr) {
            if (numarCeTrebuieCautat == i) {
                return true;
            }
        }
        return false;
    }

    private static boolean twoNumbersEqualX2(int[] arr, int sumaDorita) {
        int numarCeTrebuieCautat;
        for (int i : arr) {
            numarCeTrebuieCautat = sumaDorita - i;
            if (gasesteNumar(arr, numarCeTrebuieCautat)) return true;
        }
        return false;
    }

    private static boolean twoNumbersEqualX3(int[] arr, int sumaDorita) {
        int sumaCurenta;

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            sumaCurenta = arr[i] + arr[j];

            if (sumaCurenta == sumaDorita) return true;

            if (sumaCurenta < sumaDorita) {
                i += 1;
            } else {
                j = j - 1;
            }
        }
        return false;
    }
}