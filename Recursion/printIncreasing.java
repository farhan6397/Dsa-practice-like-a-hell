public class printIncreasing {
    // print numbers in increasing order....

     public static void PrintInc(int n){
        if (n==1)
        {
            System.out.print(1);
            return;
        }
        PrintInc(n-1);
        System.out.print(n + " ");
        
    }

    public static void main(String args[]){
        int n = 6;
        PrintInc(n);
    }
}