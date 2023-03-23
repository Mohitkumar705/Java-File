public class string {
    public static void duplicate(String str1,int indx,StringBuilder str2,boolean sc[]) {
        if(indx==str1.length())  {
            System.out.println(str2);
            return;
         }            
        char ch=str1.charAt(indx);
        if(sc[ch-'a']==true) {
            duplicate(str1, indx+1, str2, sc);
        }
        else {
            sc[ch-'a']=true;
            duplicate(str1, indx+1, str2.append(ch), sc);
        }
    
    }
    public static void main(String[] args) {
        String str1="appnacollegee";
        duplicate(str1,0,new StringBuilder(""),new boolean[26]);

    }
    
}