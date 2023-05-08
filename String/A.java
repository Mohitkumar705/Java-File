package String;
// Concaapt of Literal String Concapt
class A
{
    public static void main(String[] args) {
        String a = "Mohit";
        System.out.println(a);
        String b = "Mohit";
        System.out.println(b);
        a.concat("Kumar");// Concate nahe ho payaga  
        System.out.println(b);
        a = a.concat("Kumar");
        System.out.println(a);// Ab ho jayaga Concate 
    }
}

// Concapt of New Keyword String
class b
{
    public static void main(String[] args) {
        String a = new String("Aman");
        System.out.println(a);
        String b = new String("Aman");
        System.out.println(b);
        a.concat("Kumar");// Concate nahe ho payaga  
        System.out.println(b);
        a = a.concat("Kumar");
        System.out.println(a);// Ab ho jayaga Concate   
        a = "Nidhi";//  Agar a ma new value assiene karne ha to asa bhe kr sakta ha
        System.out.println(a);
    }
}