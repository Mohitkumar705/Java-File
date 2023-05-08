package Array;
import java.util.Scanner;
public class DeleteArray {
    public static void main(String[] args) {
        int size,loc;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Array Size");
        size = in.nextInt();
        int a[] = new int[size];
        System.out.println("Enetr Array Element");
        for(int i=0; i<size ; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Enter Array locatin");
        loc= in.nextInt();
        for(int i=loc; i<size-1; i++)
        {
            a[i] = a[i+1];
        }
        size--;
        for(int i=0; i<size ; i++)
        {
            System.out.print(a[i] +" ");
        }
        in.close();
    }
}
