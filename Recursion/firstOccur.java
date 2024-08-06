public class firstOccur {
    // First occurrence...

    public static int firstOccur(int arr[], int key, int i){
        if ( i==arr.length)
        {
            return -1;
        }
        if ( arr[i]==key){
            return i;
        }
        return firstOccur(arr, key, i+1);
    }

    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 5, 7, 3, 7, 2, 5};    
        System.out.print(firstOccur(arr, 7, 0));
    }
}