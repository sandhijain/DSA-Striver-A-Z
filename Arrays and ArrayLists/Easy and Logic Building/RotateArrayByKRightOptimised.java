public class RotateArrayByKRightOptimised {
    
        public static void reverse(int[] nums, int start, int end){
           while(start<end){
               int temp = nums[start];
               nums[start] = nums[end-1];
               nums[end-1] = temp;
   
               start++;
               end--;
   
           }
       }
   
       public static void rotateArray(int[] nums, int k) {
           int n = nums.length;
           k=k%n;
           
           reverse(nums,n-k,n);
           reverse(nums,0,n-k);
           reverse(nums,0,n);
   
   
       }

       public static void main(String[] args) {
        int[] nums = {-1,-100,3,99};
        int k = 2;
        rotateArray(nums, k);
        for(int num:nums){
            System.out.print(num +" ");
        }
       }
   }

