package Array2D;
import java.util.Scanner;
public class TransportMatrix {
    public static void main(String[] args) {
        int a[][]= new int[2][2];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0;j<2; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Array matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0;j<2; j++)
            {
                System.out.print(a[i][j] +" ");
            }
            System.out.println("  ");
        }
        System.out.println("Transport Matrix");
        for(int i=0; i<2; i++)
        {
            for(int j=0;j<2; j++)
            {
                System.out.print(a[j][i] +" ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
