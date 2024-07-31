package com.conditionalsLoops;

import java.util.Scanner;

public class P1Area {
    public static void main(String[] args) {

        Scanner ob=new Scanner(System.in);
        System.out.println("choose shape for which u want area : ");
        System.out.println("circle , triangle ,rectangle, isosceles triangle,parallelogram,rhombus,equilateral triangle");

        String shape=ob.nextLine();
        if(shape.equals("circle")){
            System.out.println("Enter Radius :");
            int radius =ob.nextInt();
            System.out.println(circle(radius));
        } else if (shape.equals("triangle")) {
            System.out.println("Enter length & height :");
            int length =ob.nextInt();
            int height=ob.nextInt();
            System.out.println(triangle(length,height));
        }


    }

    public static double triangle(int l,int h){
        final double half=0.5;
        double area=half*l*h;
        return area;
    }

    public static double circle(int r){

        final double pi=3.17;
        double area=pi*r*r;

        return area;
    }
}
