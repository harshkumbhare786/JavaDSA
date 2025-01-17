package Arrays;

import java.sql.SQLOutput;
import java.util.*;
class ArrayDemo1
{
    static int count_occurence(int[] arr,int x)
    {
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                count++;
            }
        }
        return count;
    }
}
public class Occurence
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        ArrayDemo1 obj = new ArrayDemo1();

        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter "+n+ " Element : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.print("Array Elements : {");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);
            if(i<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");

        System.out.println();
        System.out.print("Enter the Number for Counting  : ");
        int x=sc.nextInt();

        System.out.print("Count of " + x + " is : "+obj.count_occurence(arr,x));

    }
}
