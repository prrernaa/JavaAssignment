package com.firstJava;

//To find out whether the given String is Palindrome or not

import java.util.Scanner;

public class P8Palindrome {
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);
        System.out.println("Enter String : ");
        String str=ob.nextLine();

        boolean value=palindrome(str);
        boolean value2=isPalindrome(str);

        System.out.println(value);
        System.out.println(value2);
    }

    public static boolean palindrome(String s1){
        boolean flag=false;
        String str="";

        for(int i=s1.length()-1;i>=0;i--){
            str+=s1.charAt(i);
        }

        if(s1.equals(str)){
            flag=true;
        }
        return flag;
    }

    public static boolean isPalindrome(String s1){
        boolean flag=false;

        StringBuilder ob=new StringBuilder(s1);
        ob.reverse();

        if(s1.equals(ob.toString())){
            flag=true;
        }

        return flag;
    }
}
