package Array;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        int a[] = new int[5];int sum=0;double avg;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Element ");
        for(int i=0; i<5 ; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.print("Array Elements ");
        for(int i=0; i<5 ; i++)
        {
            System.out.print(a[i] + " ");
        }
        for(int i=0; i<5;i++)
        {
            sum=a[i]+sum;
        }
        avg = sum/5.0;
        System.out.print("\nAddition of array = " + sum + " " + "\nAverage of array = " +avg);
        in.close();
    }
}
