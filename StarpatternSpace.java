    import java.util.Scanner;

    public class StarpatternSpace 
    {
        public static void row(int i, int n)
        {
         if(i <=n)
            {
                space(1, i, n);
                col(1, i);
                System.out.println();
                row(i+1, n);
            } 
        } 

        public static void space(int j, int i, int n)
        {
            if(j <=n-1)
            {
                System.out.print(" ");
                space(j+1, i, n);
            }
        }
        public static void col(int j, int i)
        {
            if(j <=i)
            {
                System.out.print("*");
                col(j+1, i);
            }
        }
        public static void main(String[] args) 
        {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Size");
            int n = in.nextInt();
            row(1,n);
            in.close();   
        }
    }



