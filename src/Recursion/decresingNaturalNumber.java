package Recursion;

//Write a Program to print all Natural Number from n to 1 using Recursion

import java.util.*;
public class decresingNaturalNumber
{
    static void Printdecreasing(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        System.out.println(n);
        Printdecreasing(n-1);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        Printdecreasing(n);
    }
}
