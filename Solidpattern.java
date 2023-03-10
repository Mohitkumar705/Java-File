import java.util.Scanner;

class Solidpattern
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Your Value");
        int n = in.nextInt();
        int m=5;
        
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=m; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        in.close();

    }
}