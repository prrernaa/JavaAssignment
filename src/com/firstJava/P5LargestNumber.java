package com.firstJava;

//Take 2 numbers as input and print the largest number.

import java.util.Scanner;

public class P5LargestNumber {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter Two numbers ");
        int num1 =ob.nextInt();
        int num2=ob.nextInt();

        System.out.println("the largest number is " + largestNum(num1,num2));
    }

    public static int largestNum(int n1,int n2){
        int largest= Integer.MIN_VALUE;

        if(largest<n1 && n1>n2){
            largest=n1;
        } else {
            largest=n2;
        }

        return largest;
    }
}
