public class TillingProblem {
    public static int tileProb(int n)
    {
        // Base case
        if (n==0 || n==1)
        {
            return 1;
        }
        // choices 
        int fnm1 = tileProb(n-1);
        int fnm2 = tileProb(n-2);

        int totalWays = fnm1 + fnm2;
        return totalWays;
    }
    public static void main(String args[])
    {
        System.out.print(tileProb(4));
    }
}