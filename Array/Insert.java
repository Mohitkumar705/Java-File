package Array;
import java.util.Scanner;
public class Insert {
    public static void main(String[] args) {
        int size,loc,item;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Array Size ");
        size = in.nextInt();
        int a[] = new int[size+1];
        System.out.println("Enter Array Element");
        for(int i=0; i<size; i++)
        {
            a[i] = in.nextInt();
        }
        System.out.println("Enter Array Location");
        loc= in.nextInt();
        System.out.println("Enter new Item");
        item = in.nextInt();
        for(int i=size; i>loc; i--)
        {
            a[i] =a[i-1];      
        }
        a[loc]=item;
        size++;
        for(int i=0; i<size; i++)
        {
            System.out.print(a[i] + " ");
        }
        in.close();
    }
}
