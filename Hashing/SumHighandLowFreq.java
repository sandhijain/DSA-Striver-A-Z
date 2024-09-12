import java.util.HashMap;

public class SumHighandLowFreq {
    public int sumHighestAndLowestFrequency(int[] nums) {
       
      HashMap<Integer,Integer> hm = new HashMap<>();
      for(int num:nums){
        hm.put(num, hm.getOrDefault(num,0)+1);
      }
     
      int MaxFreq = Integer.MIN_VALUE;
      int LowFreq = Integer.MAX_VALUE;

      for(Integer n:hm.keySet()){
        int freq = hm.get(n);
        if(freq>MaxFreq){
            MaxFreq = freq;
        }
        
        if(freq < LowFreq){
            LowFreq = freq;
        }
       

      }
      

        return MaxFreq+LowFreq;
    }

    public static void main(String[] args) {
        SumHighandLowFreq shlf = new SumHighandLowFreq();
        int[] nums = {10,9,7,7,8,8,8};
        System.out.println(shlf.sumHighestAndLowestFrequency(nums));
    }
    
}
