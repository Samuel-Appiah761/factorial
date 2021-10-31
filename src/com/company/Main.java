package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int i=1,fact=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();

        while(i<=num)
        {
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial of the number: "+fact);
    }
}

