package Array;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        int a[] = new int[5];  int max;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Data"); 
        for(int i=0; i<5; i++)
        {
            a[i] = in.nextInt();
        }
        max = a[0];
        for(int i=0; i<5; i++)
        {
            if(a[i]<max)
            {
                max = a[i];
            }
        }
        System.out.println("Smallest Element " + max + " ");
        in.close();
    }
}
