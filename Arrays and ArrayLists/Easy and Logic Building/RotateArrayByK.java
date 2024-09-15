public class RotateArrayByK {
   
    public static void rotateArray(int[] nums, int k) {
        int[] temp = new int[10];
     
        int n = nums.length;
        k=k%n;
        for(int i=0;i<k;i++){  //O(k)
            temp[i] = nums[i];
        }

        for(int i=0;i<(n-k);i++){ //O(n-k)
            nums[i] = nums[i+k];
        }

        for(int i=(n-k);i<n;i++){ //O(k)
             nums[i] = temp[i-(n-k)];
        }
        
    }

public static void main(String[] args) {
    int[] nums = {1,2,3,4,5,6};
   for(int num:nums){
    System.out.print(num + " ");
   }
   System.out.println();
    int k = 100;
    rotateArray(nums, k); //O(n+k)
    for(int num:nums){
        System.out.print(num + " ");
       }
 }
}
