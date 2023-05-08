package MethodJava;
import java.util.Scanner;
public class Fun {
    int n1,n2; int add,sub,mul,div,rem;
    public static void main(String[] args) {
        Fun r = new Fun();
        r.input();
        r.process();
        r.output();
    }
    void input()
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the first number ");
        n1 = in.nextInt();
        System.out.println("Enter the secound number ");
        n2 = in.nextInt();
        in.close();
    }
    void process()
    {
        add = n1+n2;
        sub = n1-n2;
        mul = n1*n2;
        div = n1/n2;
        rem = n1%n2;  
    }
    void output()
    {
        System.out.println("Addition of two number =  "+add);
        System.out.println("Subtraction of two number = "+sub);
        System.out.println("Multiplication of two number = "+mul);
        System.out.println("Divide of number = "+div);
        System.out.println("Remender of two number = "+rem);
    }
}
