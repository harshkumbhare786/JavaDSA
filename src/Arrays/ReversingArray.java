package Arrays;

import java.util.*;

class Arraydemo78
{
    private int[] arr;
    void array()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n=sc.nextInt();

        arr=new int[n];
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
    }
    void reversearray()
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
           int temp=arr[i];
           arr[i]=arr[j];
           arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Reversed Element : {");
        for(int k=0;k<arr.length;k++)
        {
            System.out.print(arr[k]);

            if(k<arr.length-1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
    }
}
public class ReversingArray
{
    public static void main(String[] args)
    {
        Arraydemo78 obj = new Arraydemo78();
        obj.array();
        obj.reversearray();
    }
}
