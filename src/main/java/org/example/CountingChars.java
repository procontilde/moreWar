package org.example;

/*
The main idea is to count all the occurring characters in a string. If you have a string like “aba”, then the result should be {'a': 2, 'b': 1}.

What if the string is empty? Then the result should be empty object literal, {}.
 */

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class CountingChars {

    public static Map<Character, Integer> count(String str) {

        Map<Character, Integer> myMap = new LinkedHashMap<>();

        if(str == null || str.isEmpty()){
            return myMap;
        }

        for(char c: str.toCharArray()){
            myMap.put(c, myMap.getOrDefault(c, 0) + 1);
        }

        return myMap;
    }

    public static void main(String[] args){
        Scanner miScan = new Scanner(System.in);
        System.out.println("Introduzca la cadena de texto: ");
        System.out.println(count(miScan.nextLine()));
    }

}
