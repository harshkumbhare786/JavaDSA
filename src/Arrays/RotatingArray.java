package Arrays;

import java.util.*;

class Arraydemo123
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
        for (int i = 0; i < arr.length; i++)
        {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        System.out.println();

    }
    int[] rotation(int k)
    {
        int n=arr.length;
        int i=0;

        k=k%n;
        int j=0;

        int[] ans=new int[n];
        for(i=n-k;i<n;i++)
        {
            ans[j++]=arr[i];
        }

        for(i=0;i<n-k;i++)
        {
            ans[j++]=arr[i];
        }

        System.out.print("Rotation of Arrays : {");
        for (i = 0; i < ans.length; i++)
        {
            System.out.print(ans[i]);
            if (i < ans.length - 1)
            {
                System.out.print(",");
            }
        }
        System.out.print("}");
        return ans;
    }
}
public class RotatingArray
{
    public static void main(String[] arr)
    {
        Scanner sc = new Scanner(System.in);
        Arraydemo123 obj = new Arraydemo123();
        obj.arrays();

        System.out.print("Enter the value of k : ");
        int k=sc.nextInt();
        obj.rotation(k);
    }
}

