package org.example;

/*
Given a string of words, you need to find the highest scoring word.

Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.

For example, the score of abad is 8 (1 + 2 + 1 + 4).

You need to return the highest scoring word as a string.

If two words score the same, return the word that appears earliest in the original string.

All letters will be lowercase and all inputs will be valid.
 */

import java.util.HashMap;
import java.util.Map;

public class ScoringWords {
    public static void main(String[] args){
        System.out.println(scoring("Palabra cosa Rosa amor"));
    }
    public static String scoring(String words){
        String[] miStringArray = words.split(" ");
        Map<Character, Integer> myWordsMap = new HashMap<>();
        StringBuilder sB = new StringBuilder();
        for (String s : miStringArray) {
            char[] word = s.toLowerCase().toCharArray();
            for (int j=0;j<word.length;j++) {
                if(createMap().containsKey(word[j])){
                    myWordsMap.put(word[j], createMap().get(word[j]));
                    for(int i=0;i<word.length;i++){
                        if(!(i<word.length-1)){
                            sB.append(myWordsMap.get(word[i])).append(" + ");
                        }else {
                            sB.append(myWordsMap.keySet()).append(", ");
                        }
                    }
                }
            }
        }
        return sB.toString();
    }
    public static Map<Character, Integer> createMap(){
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 1);
        map.put('b', 2);
        map.put('c', 3);
        map.put('d', 4);
        map.put('e', 5);
        map.put('f', 6);
        map.put('g', 7);
        map.put('h', 8);
        map.put('i', 9);
        map.put('j', 10);
        map.put('k', 11);
        map.put('l', 12);
        map.put('m', 13);
        map.put('n', 14);
        map.put('o', 15);
        map.put('p', 16);
        map.put('q', 17);
        map.put('r', 18);
        map.put('s', 19);
        map.put('t', 20);
        map.put('u', 21);
        map.put('v', 22);
        map.put('w', 23);
        map.put('x', 24);
        map.put('y', 25);
        map.put('z', 26);
        return map;
    }
}
