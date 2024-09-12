import java.util.ArrayList;
import java.util.List;

public class MoveZerostoEnd {
    public static void moveZeroes(int[] nums) {
        List<Integer> temp = new ArrayList<>();
        int n =nums.length;
        
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                temp.add(nums[i]);
            }     
        }

        for(int i=0;i<temp.size();i++){
            nums[i] = temp.get(i);
        }
        for(int i= temp.size();i<n;i++){
            nums[i] = 0;
        }

    }
    public static void moveZeroesOptimised(int[] nums) {
        int n = nums.length;
        int j=0;
        for(int i=0;i<n;i++){
           
            if(nums[i]!=0){
                int temp = nums[j];
                nums[j] = nums[i];
                nums[i]=temp;
                j++;
            }
     }

    }
    
    public static void main(String[] args) {
        int[] nums = {0,1,4,0,5,2};
        moveZeroes(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }
        System.out.println();
       
        moveZeroesOptimised(nums);
        for(int num:nums){
            System.out.print(num + " ");
        }
    }
}
