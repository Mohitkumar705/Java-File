package OOPS.Constructor;


class M 
 {
    int a,c,f,d; String b,e;
    M(int a, String b, int c)
    {
        a=10; b="Mohit Kumar"; c=20;
        d=30; e="Sqa"; f=33;
        System.out.println(a+" " +b+" "+c+" \n"+d+" "+e+" "+f);
    }
    M(M r)
    {
        a = r.a;
        b = r.b;
        c = r.c;
        d = r.d;
        e = r.e;
        f = r.f;
    }
}
public class CopyCon {
    public static void main(String[] args) {
        M in = new M(13, "K", 10);
        M in2 = new M(in);
    }
    
}
