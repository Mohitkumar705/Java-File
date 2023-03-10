import java.util.*;
public class Conditional 
{
    public static void main(String[] args) 
    {
        System.out.println(" 1.Hello \n 2.Namestay \n 3.Jango");
        System.out.println("Please choice Your option");
        Scanner in = new Scanner(System.in);
        int button = in.nextInt();
        switch(button)
        {
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Nmastay");
            break;
            case 3: System.out.println("Jango");
            break;
            default : System.out.println("invalid code ");
        }
        in.close();   
    }
    
}
