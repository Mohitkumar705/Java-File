package Array;

import java.util.Scanner;

public class Search {
    public static void main(String[] args) {
        int a[] = new int [5]; int n,count=0;
        Scanner in = new Scanner(System.in);
        System.out.print("enter the Array size");
        for(int i=0; i<5 ; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Enter Search Element");
        n=in.nextInt();
        for(int i=0;i<5; i++)
        {
            if(a[i]==n)
            {
                count++;
            }
        }
        if(count>0)
        {
            System.out.println("Iteam fond " + count + "times");
        }
        else
        {
            System.out.println("Iteam Not Found");
        }
        in.close();
    }
}

