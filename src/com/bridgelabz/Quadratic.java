package com.bridgelabz;

import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Quadratic {
    public static void findQuadraticRoots(double a, double b, double c){
        double delta = b*b-4.0*a*c;
        if(delta>0.0) {
            double r1 = (-b + sqrt(delta)) / (2 * a);
            double r2 = (-b - sqrt(delta)) / (2 * a);
            System.out.println(" Roots 1 of the Equation " + r1);
            System.out.println(" Roots 2 of the Equation " + r2);
        }
        else if (delta==0){
            double r1 = (-b/a);
            System.out.println("The Root is: " + r1);
        }
        else {
            System.out.println("The Equation has No Real Root.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input a: ");
        double a = sc.nextDouble();
        System.out.println("Input b: ");
        double b = sc.nextDouble();
        System.out.println("Input c: ");
        double c = sc.nextDouble();
        findQuadraticRoots(a,b,c);
    }
}
