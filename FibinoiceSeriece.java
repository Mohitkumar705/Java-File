import java.util.Scanner;
public class FibinoiceSeriece {
    public static void main(String[] args) {
        int n,a=0,b=1,c;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the seriece no ");
        n = in.nextInt();
        for(int i=1; i<n; i++)
        {
            System.out.print(a + " ");
            c = a+b;
            a=b;
            b=c;
        }
        in.close();  
    }
}
