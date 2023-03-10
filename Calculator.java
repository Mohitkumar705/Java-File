import java.util.*;
public class Calculator
 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Choise Operation \n 1.Addition \n 2.Subtraction \n 3.Multiplaction \n 4.division ");
        int Choise = in.nextInt();
        System.out.println("Enter the first number");
        int n1 = in.nextInt();;
        System.out.println("Enter the secound number");
        int n2 = in.nextInt();
        
        int result =0;
        switch(Choise)
        {
            case 1:
                result =n1+n2;
                break;
            case 2 :
                result =n1-n2;
                break;
            case 3 :
                result =n1*n2;
                break;
            case 4 :
                result =n1/n2;
                break;
                default:
                 System.out.println("Enter operater is not valid ");

        }
        System.out.println("Your Result = " +  (result));
       
            in.close();
        
        
    }
    
}

