package com.bridgelabz;
import java.util.Scanner;

// using for loop

public class NaturalNumberSum1 {
    static void sumOfNNaturalNumber(int n){
        int sum = 0;
        for (int i =1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("sum of " + n + " natural number:- " + sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the value of N to find the sum of N natural number");
        int a = sc.nextInt();
        sumOfNNaturalNumber(a);

    }
}
