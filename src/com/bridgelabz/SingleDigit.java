package com.bridgelabz;

import java.util.Scanner;

public class SingleDigit {
    static void writingInWord(int n){
        if (n>=0 && n<=9){
            if (n==0){
                System.out.println("zero");
            }
            else if(n==1){
                System.out.println("one");
            }
            else if(n==2){
                System.out.println("two");
            }
            else if(n==3){
                System.out.println("three");
            }
            else if(n==4){
                System.out.println("four");
            }
            else if(n==5){
                System.out.println("five");
            }
            else if(n==6){
                System.out.println("six");
            }
            else if(n==7){
                System.out.println("seven");
            }
            else if(n==8){
                System.out.println("eight");
            }
            else if(n==9){
                System.out.println("nine");
            }
        }
        else System.out.println("invalid number");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input a single digit number:- ");
        int a = sc.nextInt();
        writingInWord(a);
    }
}
