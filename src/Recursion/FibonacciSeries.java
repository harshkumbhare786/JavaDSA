package Recursion;

// Write a program to find nth term in Fibonacci Series by using Recursion

import java.util.*;
public class FibonacciSeries
{
    static int fibonacci(int n)
    {
        if(n==0 || n==1) return n; // base case

        int prev=fibonacci(n-1);    // self work or recursion work
        int prevPrev=fibonacci(n-2);

        return prev+prevPrev; // Big Problem
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n =sc.nextInt();

        System.out.print("The Number "+n+"th term for Fibonacci series is : "+fibonacci(n));
    }
}
