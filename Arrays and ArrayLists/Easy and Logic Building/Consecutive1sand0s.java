public class Consecutive1sand0s {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int count1=0;
        int count0=0;
        int max1=0;
        int max0=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                count0=0;
                count1++;
                max1 = Math.max(max1,count1);
            }
            if(nums[i]==0){
                count1=0;
                count0++;
                max0 = Math.max(max0,count0);
            }
             
        }
        return Math.max(max0,max1);
        
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 0, 0, 1, 1, 0};
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
