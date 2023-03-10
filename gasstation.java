public class gasstation
{
    public static void main(String[] args) {
        int gas[] = {1,2,5,6,7,8};
        int cost[] = {4,6,2,7,5,9};
        for(int i=0; i<gas.length; i++)
        {
            int j = 0;
            {
                if(gas[i]> cost[j])
                {
                    System.out.println(gas[i]);
                    break;
                }
                j++;
            }
        }
    }
}