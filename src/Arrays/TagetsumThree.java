package Arrays;

import java.util.*;

class Arraydemo6
{
    static int targetsum(int[] arr,int target)
    {
        int ans=0;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                for(int k=j+1;k<arr.length;k++)
                {
                    if(arr[i]+arr[j]+arr[k]==target)
                    {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    void array()
    {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number : ");
        int n=sc.nextInt();

        System.out.print("Enter "+n+" Elements : ");

        int[] arr=new int[n];

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

        System.out.print("Enter the target : ");
        int target=sc.nextInt();
        System.out.println("The Target sum Triplet : "+targetsum(arr,target));
    }
}
public class TagetsumThree
{
    public static void main(String[] args)
    {
        Arraydemo6 obj = new Arraydemo6();
        obj.array();
    }
}
