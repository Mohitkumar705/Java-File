import java.util.*;
class Addition
{
    public static void main(String[] args) 
    {
        Scanner r = new Scanner(System.in);
        System.out.println("Enter First Number");
        int a = r.nextInt();
        System.out.println("Enter Secound Number");
        int b = r.nextInt();
        int sum = a+b;
        System.out.println("Your Result = "+ sum);
        r.close();
    }
}