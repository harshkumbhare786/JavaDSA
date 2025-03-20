package Recursion;

// Given an Integer,Find out the sum of the digits using Recursion
import java.util.*;
public class SumofDigits
{
    static int SOD(int n)
    {
        if(n>=0 && n<=9) return n;
        return SOD(n/10)+n%10;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        System.out.print("Sum of Digit is : "+SOD(n));
    }
}