package Arrays;

/* Given an array of integers 'a',move all
of them even integers at the the beginning of the array
followed b all the odd integers.The relative order of odd
ofr even integers does not matter.Return any array that
satisfies the condition
 */

import java.util.*;
class Arraydemo0001
{
    void arrays()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.print("Enter "+n+" Elements : " );
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
        System.out.println();

        EvenandOdd(arr);
        System.out.print("Sorted Elements : {");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]);

            if(i<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
    static void EvenandOdd(int[] arr)
    {
        int left=0;
        int right=arr.length-1;

        while(left<right)
        {
            while(left<right && arr[left]%2==0)
            {
                left++;
            }

            while(left<right && arr[right]%2!=0)
            {
                right--;
            }

            if(left<right)
            {
                swap(arr,left,right);
                left++;
                right--;
            }
        }
    }
    static void swap(int[] arr,int i,int j)
    {
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
public class TwoPointerEvenOdd
{
    public static void main(String[] args)
    {
        Arraydemo0001 obj = new Arraydemo0001();
        obj.arrays();
    }
}
