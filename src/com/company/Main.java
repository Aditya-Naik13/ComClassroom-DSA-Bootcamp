package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2,sum=0;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter number 1");
        num1=in.nextInt();
        System.out.println("Enter number 2");
        num2=in.nextInt();
        sum=num1+num2;
        System.out.println("The sum is = "+sum);
    }
}
