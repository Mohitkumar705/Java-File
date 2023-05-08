package Array2D;
import java.util.Scanner;
public class AddToMatrix {
    public static void main(String[] args) {
        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the First Matrix Element");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("Enter the Secound matrix Element");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                b[i][j] = in.nextInt();
            }
        }
        System.out.println("Adding the two matrix");
        for(int i=0; i<3; i++)
        {
            for(int j=0; j<3; j++)
            {
                c[i][j]=b[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println(" ");
        }
        in.close();
    }
}
