package com.flowOfProgram;

//Input a year and find whether it is a leap year or not

import java.util.Scanner;

public class P1LeapYear {
    public static void main(String[] args) {
        System.out.println("Enter the Year : ");
        Scanner ob=new Scanner(System.in);
        int year=ob.nextInt();

        if(year%4==0){
            System.out.println(year + "its a leap year ");
        }else{
            System.out.println(year + "It is not a leap year ");
        }
    }
}
