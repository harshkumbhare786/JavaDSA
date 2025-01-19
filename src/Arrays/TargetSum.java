package Arrays;

import java.util.*;

class Arraydemo4
{
    static int pairsum(int[] arr,int target)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[i]+arr[j]==target)
                {
                    ans++;
                }
            }
        }
        return ans;
    }

    void array()
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
        System.out.print("Enter Target : ");
        int target=sc.nextInt();

        System.out.print("The target sum is : "+pairsum(arr,target));
    }
}

public class TargetSum
{
    public static void main(String[] args)
    {
        Arraydemo4 obj = new Arraydemo4();
        obj.array();
    }
}
