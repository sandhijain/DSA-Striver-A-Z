import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class FindMissingNumber { //TC: O(n) SC: O(N)
    public static int missingNumber(int[] nums) {
        Set<Integer> hs = new HashSet<>(); //HashSet to store the elements of num
        for(int num:nums){ //Storing the elements
            hs.add(num);
        }
        int k = hs.size(); //k determines the size of HashSet
        for(int i=0; i<=k;i++){ //i is the iterator that check if i is not present in hs, then returns the missing number
            if(!hs.contains(i)){
                return i;
            }
        }
        return -1; //if no element is missing
    }
    public static int missingNumber2(int[] nums) {  // TC: O(nlogn)
         int n = nums.length; //n stores the size of array nums
         Arrays.sort(nums);   //sorting the nums array
         for(int i=0;i<n;i++){ //checking if value of nums at i matches the index value
            if(nums[i]!=i){
                return i; //if does not match, means that particular value is missing
            }
             
 }
        return n; //if n is missing
    }

    public static int missingNumber3(int[] nums) {  // TC: O(n)
        int n = nums.length; //n stores the size of array nums
        int sum1 = (n*(n+1))/2;   //calculating sum of all array elements
        int sum2 = 0;
        for(int i=0;i<n;i++){ //calculating sum of all the elements present in num
            sum2 = sum2 + nums[i];
            }
       return sum1-sum2; //if n is missing
   }

   public static int missingNumber4(int[] nums) {  // TC: O(n)
    int n = nums.length; //n stores the size of array nums
    int sum1 = (n*(n+1))/2;   //calculating sum of all array elements
    int sum2 = 0;
    for(int i=0;i<n;i++){ //calculating sum of all the elements present in num
        sum2 = sum2 + nums[i];
        }
   return sum1-sum2; //if n is missing
}

public static int computeXOR(int n){
    if(n%4==0) //rem:0
    return n;
    if(n%4==1) //rem:1
    return 1;
    if(n%4==2) //rem:2
    return n+1;

    return 0; //rem:3
}

public static int missingNumber5(int[] nums) {  // TC: O(n)
    int n = nums.length; //n stores the size of array nums
    int numsXOR = 0;    
    for(int i=0;i<n;i++){ //calculating sum of all the elements present in num
        numsXOR = numsXOR^ nums[i];
        }

   return numsXOR^computeXOR(n); //if n is missing
}

    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 4, 5, 6};
        System.out.println(missingNumber5(nums));
    }
}
