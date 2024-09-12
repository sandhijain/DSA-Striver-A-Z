public class RotateArrayByKOptimised {

    public static void reverse(int[] nums, int start, int end){
        while(start!=end){
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
        reverse(nums,0,k);
        reverse(nums,k,n);
        reverse(nums,0,n);


    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 100;
        rotateArray(nums, k);
        for(int num:nums){
            System.out.print(num +" ");
        }
    }
}
