package Array2D;
import java.util.Scanner;
public class Mirror {
    public static void main(String[] args) {
        int a[][] = new int[2][2];
        Scanner in = new Scanner(System.in);
        System.out.print("Enetr Array data ");
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=1; j++)
            {
                a[i][j]= in.nextInt();
            }
        } 
        System.out.println("Array matrix:");
        for(int i=0; i<=1; i++)
        {
            for(int j=0; j<=1; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        } 
        
        System.out.println("Mirror Matrix");  
        for(int i=0; i<=1; i++)
        {
            for(int j=1; j>=0; j--)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.print("\n");
        } 
        
        in.close(); 
    }
}
