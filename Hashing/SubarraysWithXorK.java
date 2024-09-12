import java.util.HashMap;

public class SubarraysWithXorK {
 public int longestSubarray(int[] nums, int k){
    HashMap<Integer,Integer> hm = new HashMap<>();
    hm.put(0,1);
    int xor = 0;
    int ans = 0;

    for(int i=0;i<nums.length;i++){
        xor ^= nums[i]; 
        if(hm.containsKey(xor^k)){
           ans += hm.get(xor^k);
        }
    hm.put(xor, hm.getOrDefault(xor, 0)+1);
        
    }
 return ans;
 }  
 
 public static void main(String[] args) {
    SubarraysWithXorK sol = new SubarraysWithXorK();
    int[] nums = {4,2,2,6,4};
    int k = 6;
    System.out.println(sol.longestSubarray(nums, k));
    
 }
}
