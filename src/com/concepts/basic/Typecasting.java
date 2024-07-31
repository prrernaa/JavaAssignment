package com.concepts.basic;

//converting one data type into another is type casting
// byte -> short -> int -> long -> float -> double

//types : implicit & explicit
// implicit : automatic conversion from smaller to larger data type
// explicit :

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args) {

        //here we are taking float value but when we run the program & give the int value then also it will run without error
        //as here the automatic conversion will take place
        Scanner ob=new Scanner(System.in);
        float num=ob.nextFloat();
        System.out.println(num);

//but here this will not work if we give float value instead of int value
        int intNum=ob.nextInt();
        System.out.println(intNum);


        //then there we have typecasting for the conversion of larger to smaller value
        //int n1=num;  // this will give error as num is float
        int n2 = (int) num;

        //System.out.println(n1);
        System.out.println(n2);


    }
}

/* Type Conversion and Casting:

Java’s Automatic Conversions
When one type of data is assigned to another type of variable, an automatic type conversion will take place if the
following two conditions are met:
• The two types are compatible.
• The destination type is larger than the source type.
Java also performs an automatic type conversion when storing a literal integer constant into variables of type
byte, short, long, or char.

Casting Incompatible Types
Although the automatic type conversions are helpful, they will not fulfill all needs. For example, what if you want to
assign an int value to a byte variable? This conversion will not be performed automatically, because a byte is smaller
than an int. This kind of conversion is sometimes called a narrowing conversion, since you are explicitly making the
value narrower so that it will fit into the target type.
*/
