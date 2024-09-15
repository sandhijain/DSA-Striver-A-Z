
import java.util.Set;
import java.util.TreeSet;

public class UnionOfTwoSortedArrays {
    
      public static int[] unionArray(int[] nums1, int[] nums2) {
        Set<Integer> hs = new TreeSet<>(); //Problem with hashSet is sorted order will not be maintained, and it is required.
        
        for(int i:nums1){
            hs.add(i);
        }
        for(int i:nums2){
            hs.add(i);
        }
        int i=0;
        int[] arr = new int[hs.size()];
        //int[] arr =  hs.stream().mapToInt(Integer::intValue).toArray();
         for(int num:hs){
            arr[i] = num;
            i++;
         }
        
        return arr;
    }
     

    //  public static int[] unionArray(int[] nums1, int[] nums2) {

        

    //  }
   
    
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 2, 3, 5};
        int[] nums2 = {1, 2, 7}; 
        for(int num: unionArray(nums1, nums2)){
            System.out.print(num + " ");
        }
    }

    
    
}
