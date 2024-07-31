package com.firstJava;

//To find Armstrong Number between two given number.

import java.util.Scanner;

public class P9ArmstrongNumber {
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);
        System.out.println("Enter 2 numbers : ");
        int num=ob.nextInt();
        int num2 =ob.nextInt();

        System.out.print("The armstrong numbers between "+num + " & "+num2+ " : ");

        for(int i=num;i<=num2;i++){
            double sumValue = value(i);
            int sum=(int)sumValue;

            //boolean armstrong=isArmstrong(i,sum);
            //System.out.println(armstrong);

            isArmstrong(i,sum);
        }

    }

    private static double value(int num){

        //method used to get the length of a number
        int length= String.valueOf(num).length();
        double len=length;

        boolean flag=false;
        double sum=0;
        while(num>0){
            if(num>0){
                double rem=num%10;

                sum += Math. pow(rem, length);


                num = num/10;

            }
        }

        return sum;
    }

    private static void isArmstrong(int num,int sum){
        //boolean flag =false;
        if(num==sum){

            System.out.print(num + " ");
        }

        //return flag;
    }
}
