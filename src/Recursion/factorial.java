package Recursion;

// Write a program to find the value of factorial n by using recursion

import java.util.*;
public class factorial
{

    static int Factorial(int n)// n=5
    {
        // base case
        if(n==0)
        {
            return 1;
        }

        //Smaller problem - Recursive work
        int smallAns=Factorial(n-1); // n=4

        // Big Problem
        int ans = n * smallAns;

        return ans;
    }
    /*
     Again very Small Method is there which is 100% valid term

        static int Factorial(int n)
        {
            if(n==0) return 1;
            return n*Factorial(n-1);
        }
    */
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        System.out.println("Factorial of  "+n+" is : "+Factorial(n));
    }
}
