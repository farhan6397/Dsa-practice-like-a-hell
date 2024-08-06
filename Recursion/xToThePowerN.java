public class xToThePowerN {
    // half power...

    public static int OptimizedPow(int x, int n){
        if (n==0){
            return 1;
        }
        int halfPow = OptimizedPow(x, n/2);
        int halfPowSq = halfPow*halfPow;

        // for odd
        if (n%2 != 0){
              halfPowSq = x*halfPowSq;
        }
        return halfPowSq;
    }


    public static void main(String args[]){
            
        System.out.print(OptimizedPow(2, 5));
    }
}