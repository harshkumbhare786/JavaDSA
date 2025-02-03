package Arrays;

/*
    Given an integer array "a" , return the prefix sum/running sum
    in the same array without creating the new array......
 */

import java.sql.SQLOutput;
import java.util.Scanner;

class ArrayQee
{
    void arrays()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter " + n + " Elements: ");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.print("Original Array: {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");

        System.out.println();

        makesumprefixarray(arr);
        System.out.print("Prefix sum : {");
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }

    static void makesumprefixarray(int[] arr)
    {
        int n=arr.length;
        for(int i=1;i<n;i++)
        {
            arr[i]=arr[i-1]+arr[i];
        }
    }
}
public class PrefixSum
{
    public static void main(String[] args)
    {
        ArrayQee obj = new ArrayQee();
        obj.arrays();
    }
}
