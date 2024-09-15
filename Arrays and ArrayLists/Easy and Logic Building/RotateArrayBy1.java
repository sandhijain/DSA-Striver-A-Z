public class RotateArrayBy1 {
    public static void rotateArrayByOne(int[] nums) {
       int temp = nums[0];

       for(int i=0;i<nums.length-1;i++){
        nums[i] = nums[i+1];
       }
       nums[nums.length - 1] = temp;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        rotateArrayByOne(nums); //{2,3,4,5,6,1}
        for(int num: nums){
            System.out.print(num +" ");
        }
       
          
    }
}
