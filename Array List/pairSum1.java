import java.util.*;
public class pairSum1{
    public static boolean pairSum(ArrayList<Integer> List, int target){
       
       int lp = 0;
       int rp = List.size()-1;

       while(lp!=rp){
        if(List.get(lp)+List.get(rp)==target)
        {
            return true;
        }
        if(List.get(lp)+List.get(rp) < target ){
            lp++;
        }
        else
        rp--;
       }
       return false;
    
    }

    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        int target = 5;
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);
        System.out.println(pairSum(List, target));
    }
}