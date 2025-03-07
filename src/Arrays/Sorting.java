package Arrays;

import java.util.*;
public class Sorting
{
    static void printarray(int[] arr)
    {

        System.out.print("Array : {");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");

            if(i<arr.length-1)
            {
                System.out.print(", ");
            }
        }
        System.out.println("}");
    }
    static void BubbleSort(int[] arr)
    {
        int temp;
        int flag;

        for(int i=0;i<arr.length;i++)
        {
            flag=0;
            for(int j=0;j<arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;

                    flag=1;
                }
            }
            if(flag==0)
            {
                break;
            }
        }
    }
    static void SelectionSort(int[] arr)
    {
        int temp=0;
        int min;

        for(int i=0;i<arr.length;i++)
        {
            min=i;
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
    }
    static void InsertionSort(int [] arr)
    {
        int temp;
        int j;

        for(int i=1;i<arr.length;i++)
        {
            temp=arr[i];
            j=i;
            while(j>0 && arr[j-1]>temp)
            {
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        int[] arr=new int[n];
        System.out.print("Enter "+n+" Elements : ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        printarray(arr);
        System.out.println();

        BubbleSort(arr);
        System.out.println("------- Bubble Sorted Element array ------");
        printarray(arr);

        System.out.println();

        SelectionSort(arr);
        System.out.println("------- Selection Sorted Element array ------");
        printarray(arr);

        System.out.println();
        InsertionSort(arr);
        System.out.println("------- Insertion Sorted Element array ------");
        printarray(arr);
    }
}
