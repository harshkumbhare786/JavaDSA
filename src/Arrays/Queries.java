package Arrays;

/* Given Q queries,Check if the given number is present in the array
or not

Note :- Value of all the Elements in the array is less than 10 to the 5
*/

import java.util.Scanner;

class Arraydemo1000
{
    void arrays()
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the Number : ");
        int n = sc.nextInt();

        int[] arr=new int[n];
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

        int[] freq = makeFrequencyArray(arr);
        System.out.print("Enter the Number of Queries : ");
        int q=sc.nextInt();

        while(q>0)
        {
            System.out.print("Enter number to be Searched : ");
            int x=sc.nextInt();

            if(freq[x]>0)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
            q--;
        }
    }
    static int[] makeFrequencyArray(int[] arr)
    {
        int[] freq = new int[100005];

        for(int i=0;i<arr.length;i++)
        {
            freq[arr[i]]++;
        }
        return freq;
    }
}
public class Queries
{
    public static void main(String[] args)
    {
        Arraydemo1000 obj = new Arraydemo1000();
        obj.arrays();
    }
}
