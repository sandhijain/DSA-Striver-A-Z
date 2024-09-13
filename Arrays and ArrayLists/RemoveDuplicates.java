public class RemoveDuplicates {
    public static int removeDuplicates(int[] nums) {
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
    
    
    public static int removeDuplicatesOptimised(int[] nums) {
        return 0;
    }
    public static void main(String[] args) {
        int[] nums = {-30, -30, 0, 0, 10, 20, 30, 30};
        System.out.println( removeDuplicates(nums));
       // System.out.println( removeDuplicatesOptimised(nums));
      
       
    }
}
