package String;

public class CompareString {
    public static void main(String[] args) {
        String a = "Loin";  // Literal String
        String b = "Loin";
        // Compare two types of string
        if(a==b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fals");
        }
        if(a.equals(b))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}

// New Keyword
class c
{
    public static void main(String[] args) {
        String a = new String("Lion");
        String b = new String("Lion");
        if(a==b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fals");
        }
        if(a.equals(b))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }

    }
}

// New keyword and Literal String
class m
{
    public static void main(String[] args) {
        String a = "Mohit";
        String b = new String("Mohit");
        if(a==b)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("Fals");
        }
        if(a.equals(b))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}