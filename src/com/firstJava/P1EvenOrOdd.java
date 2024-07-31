package com.firstJava;

//Write a program to print whether a number is even or odd, also take input from the user.

import java.util.Scanner;

public class P1EvenOrOdd {
    public static void main(String[] args) {

        System.out.println("Enter the number : ");
        Scanner ob=new Scanner(System.in);
        int num=ob.nextInt();

        if(num%2==0){
            System.out.println("Number is even ");
        }else{
            System.out.println("Number is odd ");
        }
    }
}
