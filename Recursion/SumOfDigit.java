public class SumOfDigit {
    public static int sum(int n){
        int res = 0;
        if(n==0){
            return 0;
        }
        return n%10 + sum(n/10);
    }
    public static void main (String args[]){
        System.out.print(sum(412));
    }
}