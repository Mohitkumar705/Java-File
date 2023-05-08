package MethodJava;
import java.util.Scanner;
public class Factiroal {
    public static void main(String[] args) {
        int n;
        System.out.println("Enter any number");
        Scanner r = new Scanner(System.in);
        n= r.nextInt(); 
        Factiroal ob = new Factiroal();
        int result = ob.fact(n);
        System.out.println("Factioal of your input number:" + result); 
        r.close();
    }
    int fact(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return n*fact(n-1);
        }
    }
}
