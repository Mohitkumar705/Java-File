import java.util.Scanner;

public class Hollopatt 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = in.nextInt();
        int m = 5;
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                if(i==1|| j==1|| i==n|| j==m)
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
            } 
            System.out.println();  
        }
        in.close();  
    } 
}
