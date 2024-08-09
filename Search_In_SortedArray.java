public class Search_In_SortedArray {
   public static int search(int arr[], int x){
     for(int i=0; i<arr.length; i++){
        if (arr[i]==x) {
            return i;
        }
     }
     return -1;
   }
   public static void main(String[] args) {
    int arr[] = {1, 3, 4, 5, 7, 9};
    int x=5;
    System.out.println(search(arr, x));
   }
}