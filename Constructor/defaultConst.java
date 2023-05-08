package OOPS.Constructor;
public class defaultConst {
    public static void main(String[] args) {
        A in = new A();
        in.show();  
    }
}
class A
{
    int a =10; String b = "Mohit Kumar";
    A()
    {
       // System.out.println("Your Output" + a + b);
    }
    void show()
    {
        System.out.println("Your Output \n" +a+"  " +b);
    }
}
