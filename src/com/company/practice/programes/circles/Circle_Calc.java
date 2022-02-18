package com.company.practice.programes.circles;

public class Circle_Calc
{
    public void area(int radius)
    {
        double area = radius * 22/7 ;
        System.out.println(area);
    }

    public double circumference(double radius)
    {
        double circumference = radius * 2 * 22/7;
        return circumference;
    }
}
