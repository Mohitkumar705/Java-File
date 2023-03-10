import java.util.*;
public class Function 
{
    public static int calculatSum(int a, int b)
    {
        int sum = a+b;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Enter First number ");
        Scanner in = new Scanner (System.in);
        int a = in.nextInt();
        System.out.println("enter secound number ");
        int b = in.nextInt();
        int sum = calculatSum(a, b);
        System.out.println("Addition of two number = " + sum);
        in.close();

    }
    
    
}
