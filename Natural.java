import java.util.*;
public class Natural {
    public static void main(String[] args) {
        int n, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter any Number");
        n=in.nextInt();
        for(int i=1; i<=n;i++)
        {
            sum = sum+i;
        }
        System.out.println("Addition of nature Number = " + sum);
    }
}
