package com.firstJava;

//Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

import java.util.Scanner;

public class P4Calculator {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.print("Enter two numbers : ");
        int num1=ob.nextInt();
        int num2=ob.nextInt();

        System.out.println("Enter Operator : ");
        char operator=ob.next().charAt(0);
        calculator(num1,num2,operator);
    }

    public static void calculator(int n1,int n2,char op){

        if(op=='+'){
            System.out.println("The sum of "+n1+" & " +n2+" "+(n1+n2));
        }else if (op=='-'){
            System.out.println("The subtract of "+n1+" & " +n2+" " +(n1-n2));
        }else if (op=='*'){
            System.out.println("The multiplication of "+n1+" & " +n2+" " +(n1*n2));
        }else if(op=='/'){
            if(n2==0){
                System.out.println("Can't divide by zero ..");
            }else{
                System.out.println("The division of "+n1+" & " +n2+" "+(n1/n2));
            }
        }else if(op=='%'){
            if(n2==0){
                System.out.println("Can't divide by zero ..");
            }else{
                System.out.println("The Modulo of "+n1+" & " +n2+" "+(n1%n2));
            }
        }else{
            System.out.println("Enter valid operator..");
        }
    }
}
