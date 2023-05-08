package MethodJava;
public class Recursion {
    int sum(int b)
    {
        if(b>0)
        {
            return b+sum(b-1);
        }
        else
        {
            return 0;
        }
    }
    public static void main(String[] args) {
        Recursion in = new Recursion();
        int a = in.sum(10);
        System.out.println("Sum first N Natural no :"+ a);
    }
}
