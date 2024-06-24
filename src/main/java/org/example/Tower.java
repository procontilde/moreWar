package org.example;

import java.util.Scanner;

/*
Build Tower
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ",
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ",
  "    ***    ",
  "   *****   ",
  "  *******  ",
  " ********* ",
  "***********"
]
 */

/*
package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Tower {

    public static void main(String[] args){

        System.out.println("Número:");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println(Arrays.toString(myTower(num)));

    }

    public static String[] myTower(int num){

        final String space=" ",symbol="*",jump="\n",quotMark="\"";
        String[] myArray = new String[num];
        int middle;
        if(num%2==0) middle=num/2;
            else middle = (num / 2) + 1;
        StringBuilder sB = new StringBuilder();
        for(int i=0;i<myArray.length;i++){
            sB.append(quotMark).append(space.repeat(middle)).append(symbol.repeat(i)).append(space.repeat(middle)).append(quotMark).append(jump);
            myArray[i] = sB.toString();
        }

        return myArray;
    }
}
*/

public class Tower {

    public static void main(String[] args) {
        System.out.println("Número:");
        int num = Integer.parseInt(new Scanner(System.in).nextLine());
        printTowerFormatted(myTower(num));
    }

    public static String[] myTower(int num) {
        String[] myArray = new String[num];
        int maxWidth = 2 * num - 1;

        for (int i = 0; i < num; i++) {
            int numSymbols = 2 * i + 1;
            int numSpaces = (maxWidth - numSymbols) / 2;
            StringBuilder sB = new StringBuilder();

            sB.append(" ".repeat(numSpaces));
            sB.append("*".repeat(numSymbols));
            sB.append(" ".repeat(numSpaces));

            myArray[i] = sB.toString();
        }

        return myArray;
    }

    public static void printTowerFormatted(String[] tower) {
        System.out.println("[");
        for (int i = 0; i < tower.length; i++) {
            System.out.print("  \"" + tower[i] + "\"");
            if (i < tower.length - 1) {
                System.out.print(",");
            }
            System.out.println();
        }
        System.out.println("]");
    }
}

