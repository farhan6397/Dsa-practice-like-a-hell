public class GetLargest {
  
    public static int largestNum(int arr[]){
        int res = 0;
        int i;
        for(i=1; i<arr.length; i++){
            if (arr[res] < arr[i]) {
                res=i;
                
            }   
        }
        return res;
    }
    public static void main(String[] args) {
        // int arr[] = {10, 5, 20, 9};
        int arr[] = {40, 8, 50, 100};
        System.out.println(largestNum(arr));
    }
}
