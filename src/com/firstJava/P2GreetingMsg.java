package com.firstJava;

//Take name as input and print a greeting message for that particular name.

import java.util.Scanner;

public class P2GreetingMsg {
    public static void main(String[] args) {
        System.out.println("Enter your name : ");
        Scanner ob=new Scanner(System.in);
        String name=ob.nextLine();

        System.out.println(naam(name));

    }

    public static String naam(String name){
        String msg;
        msg="Hello "+name;
        return msg ;
    }
}
