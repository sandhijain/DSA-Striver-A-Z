import java.util.HashMap;
import java.util.Map;

public class SecondHighestOccuringElement {
    public int secondMostFrequentElement(int[] nums) {
     Map<Integer,Integer> hm = new HashMap<>();
     for(int num:nums){
        hm.put(num, hm.getOrDefault(num, 0)+1); //Logic for adding frequency of every element- if it exists add 1 to the original else start with 1.
     }
     int MaxElem = Integer.MIN_VALUE;
     int MaxFreq = Integer.MIN_VALUE;
     for(Integer n: hm.keySet()){
        int freq = hm.get(n);
        if(freq>MaxFreq){
            MaxFreq = freq;
            MaxElem = n;
        }
        else if(freq == MaxFreq && n<MaxElem){
            MaxElem = n;
        }
     }

     int secMaxElem = Integer.MIN_VALUE;
     int secMaxFreq = Integer.MIN_VALUE;
     for(Integer k: hm.keySet()){
        int freq = hm.get(k);
        if(freq>secMaxFreq && freq<MaxFreq){
            secMaxFreq = freq;
            secMaxElem = k;
        }
        else if(freq == secMaxFreq && k<secMaxElem){
            secMaxElem = k;
        }
        
     }
 

     return secMaxFreq == Integer.MIN_VALUE?-1:secMaxElem;
}

    public static void main(String[] args) {
        int[] nums = {1,2,2,3,3,3};
        SecondHighestOccuringElement  shoe = new SecondHighestOccuringElement();
        System.out.println(shoe.secondMostFrequentElement(nums));
    }
}