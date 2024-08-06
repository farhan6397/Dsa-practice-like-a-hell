// Sorted and rotated ArrayList. [11, 15, 6, 8, 9, 10]

import java.util.*;
public class pairSum2{
    public static boolean pairSum(ArrayList<Integer> List, int target){
       int bp = -1;

       for(int i=0; i<List.size(); i++){
        if(List.get(i) > List.get(i+1)){
            bp = i;                   // breaking point...
            break;
        }
       }
         int lp = bp+1; // smallest
         int rp = bp;

       while(lp!=rp){
        // case 1
        if(List.get(lp)+List.get(rp)==target)
        {
            return true;
        }
        // case 2
        if(List.get(lp)+List.get(rp) < target ){
            lp = (lp+1)%List.size();
        }
        // case 3
        if(List.get(lp) + List.get(rp) > target){
            rp = (List.size() + rp -1)%List.size();
        }
       }
       return false;
    
    }

    public static void main(String args[]){
        ArrayList<Integer> List = new ArrayList<>();
        int target = 16;
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);
        System.out.println(pairSum(List, target));
    }
}