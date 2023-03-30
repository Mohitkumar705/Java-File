import java.util.Scanner;

public class ASCIT {
    public static void main(String[] args) {
        char ch;
        System.out.println("Enter A String Letter Only");
        Scanner in = new Scanner(System.in);
        ch = in.next().charAt(0);
        int a=ch;
        System.out.println("ASCIT value " + ch + " is  " + a);

    }
}
