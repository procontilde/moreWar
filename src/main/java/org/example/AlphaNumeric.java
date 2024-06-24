package org.example;

/*
In this example you have to validate if a user input string is alphanumeric. The given string is not nil/null/NULL/None, so you don't have to check that.

The string has the following conditions to be alphanumeric:

At least one character ("" is not valid)
Allowed characters are uppercase / lowercase latin letters and digits from 0 to 9
No whitespaces / underscore
 */

public class AlphaNumeric {

/*
    public static boolean alphanumeric(String s){

        if(s.isEmpty()){
            System.out.println("ERROR");
            return false;
        }
        char[] myArray = s.toCharArray();

        for(int i=0;i<myArray.length;i++){

            if(!Character.isLetterOrDigit(myArray[i])){
                System.out.println("ERROR. No se permite el caracter: " + myArray[i]);
                return false;
            }else if(myArray[i] == '_'){
                System.out.println("ERROR. No se permite el caracter: " + myArray[i]);
                return false;
            }else if(myArray[i] == ' '){
                System.out.println("ERROR. No se permite el caracter: " + myArray[i]);
                return false;
            }else{
                System.out.println("El texto ha sido validado");
                return true;
            }
        }

        return true;
    }
*/
public static boolean alphanumeric(String s) {

    if (s.isEmpty()) {
        System.out.println("ERROR");
        return false;
    }


    for (char c : s.toCharArray()) {

        if (!Character.isLetterOrDigit(c)) {
            System.out.println("ERROR. No se permite el caracter: " + c);
            return false;
        }
    }


    System.out.println("El texto ha sido validado");
    return true;
}


}
