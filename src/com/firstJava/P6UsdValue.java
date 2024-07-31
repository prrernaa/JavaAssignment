package com.firstJava;

//Input currency in rupees and output in USD

import java.util.Scanner;

public class P6UsdValue {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter rupees value : ");
        double rupee=ob.nextDouble();

        System.out.println(rupeeToUsd(rupee));
    }

    private static double rupeeToUsd(double rupee) {
        double usdValue=rupee/84;

        return usdValue;
    }
}
