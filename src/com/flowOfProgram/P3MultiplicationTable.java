package com.flowOfProgram;

import java.util.Scanner;

public class P3MultiplicationTable {
    public static void main(String[] args) {
        System.out.println("Enter the number for table : ");
        Scanner ob=new Scanner(System.in);
        int n1=ob.nextInt();
        System.out.println("the multiplication of "+n1+" is : ");
        for(int i=1;i<11;i++){
            System.out.println(n1*i);
        }

    }


}
