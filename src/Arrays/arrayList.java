package Arrays;

import java.util.*;
public class arrayList
{
    public static void main(String[] args)
    {
        Integer i =Integer.valueOf(4);
        System.out.println(i);

        Float f = Float.valueOf(4.4f);
        System.out.println(f);

        ArrayList<Integer> l1 = new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8);

        System.out.println(l1.get(1));
        System.out.println();
        System.out.print(l1+" ");

        System.out.println();
        l1.add(0,1000);
        System.out.println(l1+" ");

        System.out.println();
        l1.set(0,10);
        System.out.print(l1+" ");

        System.out.println();
        l1.remove(2);
        System.out.print(l1+" ");

        System.out.println();
        l1.remove(Integer.valueOf(10));
        System.out.print(l1+" ");

        System.out.println();
        boolean ans = l1.contains(Integer.valueOf(8));
        System.out.print(ans);
    }
}
