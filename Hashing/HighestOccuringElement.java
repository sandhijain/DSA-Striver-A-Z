import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class HighestOccuringElement {
    public int mostFrequentElement(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int max = Integer.MIN_VALUE;
     for(int i=0;i<nums.length;i++){
        System.out.println( "Value of nums[i]"+ nums[i]);
        if(hm.containsKey(nums[i])){
            hm.put(nums[i],hm.get(nums[i])+1);
            System.out.println("If key matches then hm:"+hm);
        }
        hm.put(nums[i],hm.getOrDefault(nums[i],1));
        System.out.println("For the first time: "+hm);
     }

     System.out.println("After all additions:" + hm);
     for(Integer num: hm.keySet()){
        if(hm.get(num)>max){
            max = hm.get(num);
            System.out.println("Max at every stage:"+max); 
        }
        max = Math.max(max,hm.get(num));
        System.out.println("Max at final stage:"+max);
     }

     Set<Integer>keys = new HashSet<>();
     if(hm.containsValue(max)){
        for(Map.Entry<Integer,Integer> entry: hm.entrySet()){
            if(Objects.equals(entry.getValue(), max)){
                keys.add(entry.getKey()); }
        }
     }
     
     System.out.println(keys);
     
     

     return Collections.min(keys);
    }


    public static void main(String[] args) {
        int[] nums = {10,9,7};
        HighestOccuringElement hoe = new HighestOccuringElement();
        System.out.println(hoe.mostFrequentElement(nums));
    }
}
