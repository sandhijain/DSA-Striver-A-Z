import java.util.HashMap;

public class LongestSubarraySumK {
 public int longestSubarray(int[] nums, int k){
    HashMap<Integer,Integer> hm = new HashMap<>();
    hm.put(0,-1);
    int sum = 0;
    int ans = 0;

    for(int i=0;i<nums.length;i++){
        sum += nums[i];
        if(hm.containsKey(sum-k)){
           ans = Math.max(ans,(i-hm.get(sum-k)));
        }
     if(!hm.containsKey(sum)){
        hm.put(sum,i);
     }
        
    }
 return ans;
 }  
 
 public static void main(String[] args) {
    LongestSubarraySumK sol = new LongestSubarraySumK();
    int[] nums = {100,5,2,7,1,200};
    int k = 15;
    System.out.println(sol.longestSubarray(nums, k));
    
 }
}
