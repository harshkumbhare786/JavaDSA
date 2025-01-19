package Arrays;

import java.util.*;

class Arraydemo7
{
    static int arrayman(int[] arr)
    {
        int ans=-1;

        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]==arr[j])
                {
                    arr[i]=-1;
                    arr[j]=-1;
                }
            }
        }

        for(int k=0;k<arr.length;k++)
        {
            if(arr[k]>0)
            {
                ans=arr[k];
            }
        }
        return ans;
    }

    void array()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n = sc.nextInt();

        System.out.print("Enter " + n + " Elements : ");

        int[] arr = new int[n];

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
        System.out.println();

        System.out.println("Unique Number : "+arrayman(arr));
    }
}

public class ArrayManupulation
{
    public static void main(String[] args)
    {
        Arraydemo7 obj= new Arraydemo7();
        obj.array();
    }
}
