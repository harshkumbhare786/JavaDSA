package Recursion;

import java.util.*;
public class NaturalNumbers
{
    static void printIncreasing(int n)
    {
        if(n==1)
        {
            System.out.println(n);
            return ;
        }
        printIncreasing(n-1); // n-1 = 1,2,3,4,.....,n-1
        System.out.println(n);//n=1,2,3,4,.....,n

    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        printIncreasing(n);
    }
}
