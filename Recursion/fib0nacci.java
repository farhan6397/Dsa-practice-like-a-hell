public class fib0nacci {
    
    // fibonacci series...

    public static int Fibonacci(int n)
    {
        if (n==0 || n==1)
        {
            return n;
        }
        int fnm1 = Fibonacci(n-1);
        int fnm2 = Fibonacci(n-2);
        int fn = Fibonacci(n-1) + Fibonacci(n-2);
        return fn;
    }

     public static void main(String args[]){
        int n = 6; 
        System.out.print(Fibonacci(n));
       
    }
}