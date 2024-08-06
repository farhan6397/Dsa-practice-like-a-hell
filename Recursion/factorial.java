public class factorial {
     // Factorial of a number...

    public static int Factorial(int n)
    {
        if (n==0)
        {
            return 1;
        }      
        int fnm1 = Factorial(n-1);
        int fn = n*Factorial(n-1);
        return fn;
    }

     public static void main(String args[]){
        int n = 6; 
        System.out.print(Factorial(n));
       
    }
}