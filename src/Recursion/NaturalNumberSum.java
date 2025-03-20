package Recursion;

//Given an Integer,Find out the sum of the Natural Numbers using Recursion
import java.util.*;
public class NaturalNumberSum
{
   static int Naturalnumber(int n)
   {
       if(n==0) return n;
       return (n*(n+1))/2;
   }
   public static void main(String[] args)
   {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the Number : ");
       int n = sc.nextInt();

       System.out.print("Sum of Natural Number is : "+Naturalnumber(n));
   }
}