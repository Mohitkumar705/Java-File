package Array;

import java.util.Arrays;

public class Compare {
    public static void main(String[] args) {
        int a[] = {10,20,30,40,50};
        int b[] = {10,20,30,40,50};
        if(Arrays.equals(a,b))
        {
            System.out.println("Equals");
        }
        else
        {
            System.out.println("Not Equals");
        }
    }
}
