import java.util.Scanner;

public class Loops 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the value");
        int n = in.nextInt();
        int sum=0;
        for(int i=1 ;i<=n;i++ )
        {
            sum = sum+i;
        }
        System.out.println("Your Result " + (sum));
        in.close();
        
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the value");
        // int n = in.nextInt();
        
        // for(int i=1; i<=10;i++)
        // System.out.println("NX=" + (n*i));
        // in.close();
    } 
}
