package Arrays;

import java.util.*;
class Arrayelement
{
    public int firstrepeating(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    return arr[i];
                }
            }
        }
        return -1;
    }
    void array()
    {
        {
            Scanner sc=new Scanner(System.in);
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
            System.out.println();

            System.out.println("The First Repeating number is : "+firstrepeating(arr));
        }
    }
}
public class FirstRepeatingNumber
{
    public static void main(String[] args)
    {
        Arrayelement obj = new Arrayelement();
        obj.array();
    }
}
