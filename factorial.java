public class factorial {
    public static void printFactorial(int n)
    {
        int factorial = 1;
        for(int i=n; i>=1;i--)
        {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
    
}
