package com.bridgelabz;

import java.util.Scanner;

public class Distance {
    public static void calculatingDistance(int x,int y){
        double d = Math.sqrt(x * x + y * y);
        System.out.println("The total distance is : " + d);
    }
    public static void main(String[] args) {
        System.out.print("Enter the value of X : ");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.print("Enter the value of Y : ");
        int y = sc.nextInt();
        calculatingDistance(x,y);
    }
}
