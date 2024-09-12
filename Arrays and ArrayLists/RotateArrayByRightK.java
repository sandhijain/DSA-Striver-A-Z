public class RotateArrayByRightK {

    public static void rotateArray(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int[] temp = new int[n-k];
     
        for(int i=0;i<(n-k);i++){  //O(n-k)
            temp[i] = nums[i];
        }

        for(int i=(n-k);i<n;i++){ //O(n-k)
            nums[i-(n-k)] = nums[i];
        }

        for(int i=k;i<n;i++){ //O(k)
             nums[i] = temp[i-k];
        }

    }
    
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6};
        int k = 2;
        rotateArray(nums, k);
        for(int num:nums){
            System.out.print(num +" ");
    }
}
}
