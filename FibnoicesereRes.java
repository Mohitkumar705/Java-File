public class FibnoicesereRes {
    public static void printFibonaice(int a, int b, int n)
    {
        if(n==0)
        {
            return;
        }
        int c=a+b;
        System.out.println(c);
        printFibonaice(b, c, n-1);
    }
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.println(a);
        System.out.println(b);
        int n=10;
        printFibonaice(a, b, n-2);
    }
}
