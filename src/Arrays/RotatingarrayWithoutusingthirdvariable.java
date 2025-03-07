package Arrays;

import java.util.Scanner;

// Rotating Array without using Third Variable.......
class ArrayDdemo12
{
    private int[] arr;

    void arrays()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        arr=new int[n];
        System.out.print("Enter " + n + " Elements : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array Elements : {");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();
    }
    private void revere(int[] array,int start,int end)
    {
        while(start<end)
        {
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;

            start++;
            end--;
        }
    }

    void rotation(int k)
    {
        int n=arr.length;
        k=k%n;
        revere(arr,0,n-1);
        revere(arr,0,k-1);
        revere(arr,k,n-1);
        System.out.println("Rotated Array: " + java.util.Arrays.toString(arr));
    }
}
public class RotatingarrayWithoutusingthirdvariable
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        ArrayDdemo12 obj = new ArrayDdemo12();
        obj.arrays();

        System.out.print("Enter the value of k : ");
        int k=sc.nextInt();
        obj.rotation(k);
    }
}
