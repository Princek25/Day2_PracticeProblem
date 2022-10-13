package com.bridgelabz;

import java.util.Scanner;

public class MultipleDigit {
    static void writingInWords(int n){
        if (n==1){
            System.out.println("unit");
        } else if (n==10) {
            System.out.println("ten");
        } else if (n==100) {
            System.out.println("hundred");
        } else if (n==1000) {
            System.out.println("thousand");
        }
        else System.out.println("invalid number");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a number like 1,10,100 :- ");
        int a = sc.nextInt();
        writingInWords(a);

    }
}
