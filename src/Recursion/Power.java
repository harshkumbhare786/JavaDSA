package Recursion;

// Given Two Number p and q.Find the value of p^q using Recursion Function

import java.util.*;
public class Power
{
    static int pow(int p,int q)
    {
        if(q==0) return 1;
        return pow(p,q-1)*p;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of P as a Base : ");
        int p=sc.nextInt();

        System.out.print("Enter the value of q as a Power : ");
        int q=sc.nextInt();

        System.out.print("The value of "+p+"^"+q+" is : "+pow(p,q));
    }
}
