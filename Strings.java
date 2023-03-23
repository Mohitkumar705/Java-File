//import java.util.*;
public class Strings
{
    public static void main(String[] args) {
       // StringBuilder sb = new StringBuilder("Hello");
        //System.out.println(sb);
        //char at index 0
       // System.out.println(sb.charAt(0));
        //set char at index 0

        //sb.setCharAt(0,'p');
        // System.out.println(sb);
       // sb.insert(0,'p');
       // System.out.println(sb);
        //delet the string 1 come tak jate ha s1tring 
       // sb.delete(2, 3);
       // System.out.println(sb);
        // append the string matlab last ma add krna 
       // sb.append("h");
       // sb.append("e");
       // sb.append("e");
       // sb.append("l");
       // sb.append("o");
       // System.out.println(sb.length());
        // Reverse the string 
       
        StringBuilder sb = new StringBuilder("Mohit");
        for(int i=0; i<sb.length() /2;i++)
        {
            int front = i;
            int back = sb.length() -1-i;
            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);
            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);

        }
        System.out.println(sb);
        
    }
    
}
