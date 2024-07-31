package com.firstJava;

//Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.

import java.util.Scanner;

public class P3SimpleInterest {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);

        System.out.print("Enter principal amount :");
        int principal=ob.nextInt();

        System.out.print("Enter time :");
        int time=ob.nextInt();

        System.out.print("Enter rate of interest :");
        int rate=ob.nextInt();

        System.out.println(simpleInterest(principal,time,rate));
    }

    public static double simpleInterest(int p,int t,int r){
        double simpleInterest= (p*r*t)/100;

        return simpleInterest;
    }

}
