package org.example;

import java.util.Scanner;

public class Asterisk {

    public static void main(String[] args) {

        Scanner miScan = new Scanner(System.in);
        System.out.println("Número: ");
        int num = Integer.parseInt(miScan.nextLine());

        // Limitar el tamaño de la entrada para evitar problemas de memoria
        if (num > 1000) {
            System.out.println("El número es demasiado grande.");
        } else {
            System.out.println(diamond(num));
        }
    }

    private static String diamond(int number) {

        StringBuilder stringB = new StringBuilder();
        final String space = " ", jump = "\n", symbol = "*";

        if (number % 2 != 0) {
            int middle = number / 2 + 1;

            for (int i = 1; i <= middle; i++) {
                stringB.append(space.repeat(middle - i));
                stringB.append(symbol.repeat(2 * i - 1));
                stringB.append(jump);
            }

            for (int i = middle - 1; i > 0; i--) {
                stringB.append(space.repeat(middle - i));
                stringB.append(symbol.repeat(2 * i - 1));
                stringB.append(jump);
            }

            return stringB.toString();

        } else {
            return "El número debe ser impar.";
        }
    }
}

/*
public class asterisc {

    public static void main(String[] args) {

        Scanner miScan = new Scanner(System.in);
        System.out.println("Número: ");
        int num = Integer.parseInt(miScan.nextLine());

        System.out.println(diamond(num));

    }

    private static String diamond(int number) {

        StringBuilder stringB = new StringBuilder();
        final String space = " ", jump = "\n", symbol = "*";
        int iteratorNumber = 0, lineSize = 0;

        if (number % 2 != 0) {

            do {

                stringB.append(space.repeat(number - lineSize));
                stringB.append(symbol.repeat(number - iteratorNumber));
                stringB.append(jump);

                iteratorNumber -= 2;
                lineSize--;

            } while ((number - iteratorNumber) > 0);

            return stringB.toString();

        } else return stringB.toString();

    }





















        stringB.append("*".repeat(number));
        stringB.append(jump);

        for(int i = number; i > 0; i - 2) {

            stringB.append(space);
            stringB.append("*".repeat(symbolNumber));
            stringB.append(jump);

        }
/*



}
*/
