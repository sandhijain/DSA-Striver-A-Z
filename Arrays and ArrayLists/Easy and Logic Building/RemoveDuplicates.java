import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static int removeDuplicatesOptimised1(int[] nums) {
    int n = nums.length;
   
    int uniqueCount = 1;
    for(int i=1;i<n;i++){
        if(nums[i]!= nums[uniqueCount-1]){
            nums[uniqueCount] = nums[i];
            uniqueCount++;
        }
    }
   
    return uniqueCount;
        
    }
    
    
    public static int removeDuplicatesOptimised2(int[] nums) {
       int n = nums.length;
       int j = 0;
       for(int i=0;i<n;i++){
        if(nums[j]!=nums[i]){
            nums[j+1] = nums[i];
            j++;
        }
       }
       return j+1;
    }

    public static int removeDuplicatesBrute(int[] nums) {
        Set<Integer>hs = new LinkedHashSet<>();
        for(int num:nums){
            hs.add(num);
        }
        int j=0;
        for(int newNum: hs){
            nums[j] = newNum;
            j++;
        }

        return hs.size();
        
    }
    public static void main(String[] args) {
        int[] nums = {-30, -30, 0, 0, 10, 20, 30, 30};
        System.out.println( removeDuplicatesBrute(nums));
        for(int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();
       
      
       
    }
}
