public class LinearSearch {

    public static int linearSearch(int nums[], int target) {
		int index = -1;
        for(int i=0;i<nums.length;i++){
            if(target == nums[i]){
                index = i;
                break;
            }
}
    return index>=0?index:-1;
        
    }
    public static void main(String[] args) {
        int[] nums = {1,5,6,8,9,6,2,3
        };
        int target = 6;
        System.out.println(linearSearch(nums, target));
    }
}