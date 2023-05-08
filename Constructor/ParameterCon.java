package OOPS.Constructor;

class a
{
    int x,y;
    a(int a, int b)//parametersized cons
    {
        x = a; y=b;
    }
    void show()
    {
        System.out.println(x+" "+y);
    }
}
public class ParameterCon {
    public static void main(String[] args) {
        a in = new a(100, 200);
        in.show();
    }
    
}
