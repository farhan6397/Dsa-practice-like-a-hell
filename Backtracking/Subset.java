public class Subset{
    public static void FindSubset(String str, int i, String ans){
        // Base case..
        if(i==str.length()){
            if(ans.length() == 0){
                System.out.print("null");
            }else{
                System.out.println(ans);
            }
            return;
        }
        // choice >> yes
        FindSubset(str, i+1, ans+str.charAt(i) );
        // choice >> No
        FindSubset(str, i+1, ans);
        
    }
    public static void main(String args[]){
        String str = "abc";
        FindSubset(str, 0, "");
    }
}