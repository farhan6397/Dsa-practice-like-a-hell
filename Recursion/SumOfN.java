public class SumOfN {
    // Sum of N numbers....

    public static int SumN(int n)
    {
        if (n==1)
        {
            return 1;
        }      
        int fnm1 = SumN(n-1);
        int fn = n+SumN(n-1);
        return fn;
    } 

     public static void main(String args[]){
        int n = 6; 
        System.out.print(SumN(n));
       
    }


}