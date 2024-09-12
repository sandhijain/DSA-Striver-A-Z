import java.util.TreeSet;
class LongestConsecutive {
    public int longestConsecutive(int[] nums) {
        TreeSet<Integer> ts = new TreeSet<>();
        for(int j=0;j<nums.length;j++){
            ts.add(nums[j]);
        }
        System.out.println(ts);
       int maxCount = 1;
       int currCount = 1;
        int prevNum = ts.first();
       for(Integer num : ts){
        if(num  == prevNum + 1){
            currCount++;
        }
        else {
        maxCount = Math.max(currCount,maxCount);
        currCount = 1;
       }
       prevNum = num;
   }
    
    maxCount = Math.max(maxCount, currCount);
    return maxCount;
}

    public static void main(String[] args) {
        LongestConsecutive longestConsecutive = new LongestConsecutive();
        int[] arr = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println(longestConsecutive.longestConsecutive(arr));
    }
}

    

