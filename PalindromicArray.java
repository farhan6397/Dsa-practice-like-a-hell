public class PalindromicArray {
    public static boolean isPalindromicArray(int[] arr) {
        int n=arr.length;
        int flag=0;
        for(int i=0; i<n/2; i++){
            if(arr[i]!=arr[n-i-1]){
                flag=1;
            }
            if(flag==1)
            return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1};
        System.out.println(isPalindromicArray(arr));
    }
}
