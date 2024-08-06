public class IsArrSorted {
     // is sorted array....

    public static boolean IsSorted(int arr[], int i){
        if ( i == arr.length-1){
            return true;
        }
        if (arr[i]>arr[i+1]){
            return false;
        }
        else{
            return IsSorted(arr, i+1);
        }
    }
     public static void main(String args[]){
        int n = 6;
        int arr[] = {1, 2, 3, 4, 5, 7, 3, 7, 2, 5};    
        System.out.print(IsSorted(arr, 0));
    }
}