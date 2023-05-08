import java.util.Scanner;
public class TripleSerice {
    public static void main(String[] args) {
        int n,a=0,b=1,c=2,d;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter The Term Of Seriece");
        n= in.nextInt();
        for(int i=1; i<n; i++)
        {
            System.out.print(a + " ");
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        in.close();
    }
}
