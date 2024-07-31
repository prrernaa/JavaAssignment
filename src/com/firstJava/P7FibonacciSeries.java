package com.firstJava;

//To calculate Fibonacci Series up to n numbers

import java.util.Scanner;

public class P7FibonacciSeries {
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);
        System.out.println("Enter number : ");
        int num=ob.nextInt();

        System.out.println();

        fibonacci(num);
    }

    public static void fibonacci(int n){
        int first = 0;
        int second =1;

        for(int i=0;i<n;i++){

            System.out.print(first +" ");

            int nextNumber= first+second;
            first=second;
            second=nextNumber;
        }

    }
}
