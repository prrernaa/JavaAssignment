package com.flowOfProgram;

//Take two numbers and print the sum of both.

import java.util.Scanner;

public class P2SumOfNumbers {
    public static void main(String[] args) {
        System.out.println("Enter two numbers : ");
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        int n2=ob.nextInt();


        System.out.println(sum(n1,n2));
    }
    public static int sum(int a,int b){
        int sum=a+b;
        System.out.print("The sum of two numbers is: ");

        return sum;
    }
}
