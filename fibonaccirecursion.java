public class fibonaccirecursion {
    public static int  fibonaccci(int n)  {
          if(n==0){
            return 0;
        }
        if(n==1) {
            return 1;
        }
    int f1=fibonaccci(n-1);
    int f2=fibonaccci(n-2);
    return f1+f2;
    }
    public static void main(String[] args) {
        int n=7;
    System.out.println(fibonaccci(n));
}
}
