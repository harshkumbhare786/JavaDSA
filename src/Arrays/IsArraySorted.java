package Arrays;

import java.util.*;
class Arraysorted
{
    static boolean sorted(int[] arr)
    {
        boolean check=true;
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i-1]>arr[i])
            {
                check=false;
                break;
            }
        }
        return check;
    }
    void array()
    {
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        int[] arr=new int[n];

        System.out.print("Enter "+n+" Elements : ");
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

        System.out.print("Is Array Sorted : "+sorted(arr));
    }
}
public class IsArraySorted
{
    public static void main(String[] args)
    {
        Arraysorted obj=new Arraysorted();
        obj.array();
    }
}
