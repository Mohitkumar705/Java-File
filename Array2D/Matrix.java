package Array2D;
import java.util.Scanner;
public class Matrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter The Matrix");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.print("Create the Matrix:\n");
        for(int i=0;i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.print("\n");
        }
        in.close();
    }
}
