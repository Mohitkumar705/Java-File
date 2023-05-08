package Array;
import java.util.*;
public class Method {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Data");
        for(int i=0; i<5; i++)
        {
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        for(int i=0; i<5; i++)
        {
            System.out.print(a[i] +  " ");
        }
        in.close();
    }
}
