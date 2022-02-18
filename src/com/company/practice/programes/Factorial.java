package com.company.practice.programes;

import java.util.Scanner;

/*
* Aim: To calculate the factor of the number which is entered by the user
* */
public class Factorial
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to calculate the factors of the that number: ");
        int num = scanner.nextInt();

        for (int i = 1; i <= num; i++)
        {
            if (num%i == 0) {
                System.out.println(i);
            }
        }
    }
}
