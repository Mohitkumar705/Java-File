

public class ChechSortedArray {
    static boolean checkarray(int n[],int a)
    {
        int i,j;
        for(i=0;i<a;i++)
        {
            for(j=i+1;j<a;j++)
            if(n[i]>n[j])
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int n[]={1,2,3,4,5,6};
        int a=n.length;
        boolean sorted=checkarray(n,a);
        if(sorted)
        {
            System.out.println("array is sorted  ");
        }
        else
        {
            System.out.println("anand ki gand me mere loda");
        }
    }
}
