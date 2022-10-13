package com.bridgelabz;

import java.util.Scanner;

public class VowelOrConsonant {
    static void checkVowel(String s){
        switch (s){
            case "a" : System.out.println("Vowel"); break;
            case "i" : System.out.println("Vowel"); break;
            case "o" : System.out.println("Vowel"); break;
            case "u" : System.out.println("Vowel"); break;
            case "e" : System.out.println("Vowel"); break;
            case "A" : System.out.println("Vowel"); break;
            case "I" : System.out.println("Vowel"); break;
            case "O" : System.out.println("Vowel"); break;
            case "U" : System.out.println("Vowel"); break;
            case "E" : System.out.println("Vowel"); break;
            default  : System.out.println("consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a letter from a to z or A to Z");
        String s = sc.next();
        checkVowel(s);

    }
}
