package com.concepts.basic;

public class TypePromotions {
    public static void main(String[] args) {

        //automatic type promotion in expressions
        int a = 257;
        //the max range of byte is 256 & here we are trying to store the 257 in byte variable which
        // is not possible hence what it does is that take the reminder & prints it
        byte b=(byte)a;  // 257 % 256 =1

        System.out.println(b);

        byte n1=20;
        byte n2=40;
        byte n3=100;

        //here we have n1 & n2 both are byte but here we n1*n2=800 which is exceeding the limit
        //still we are not getting any error
        // because in these cases we store the intermediate results in the int value itself
        int result=n1* n2 /n3;
        System.out.println(result);

        //n1=n1*20;
        // error : intermediate are stored in int hence u can not assign the int value to byte
    }
}

/* The Type Promotion Rules:

Java defines several type promotion rules that apply to expressions.
They are as follows: First, all byte, short, and char values are promoted to int, as just described.
Then, if one operand is a long, the whole expression is promoted to long. If one operand is a float,
the entire expression is promoted to float. If any of the operands are double, the result is double.

*/