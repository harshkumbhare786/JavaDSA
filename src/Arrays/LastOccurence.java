package Arrays;
import java.util.*;

public class LastOccurence
{
    static int last_occurence(int[] arr,int x)
    {
        int lastOccurence=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
            {
                lastOccurence=i;
            }
        }
        return lastOccurence;
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
        System.out.print("Enter X : ");
        int x=sc.nextInt();

        System.out.println("Last Count of "+x+ " is : "+last_occurence(arr,x));

    }
}
class ArrayDem
{
    public static void main(String[] args)
    {
        LastOccurence obj = new LastOccurence();
        obj.array();
    }
}
