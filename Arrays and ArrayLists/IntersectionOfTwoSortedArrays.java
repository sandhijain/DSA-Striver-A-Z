import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;
import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoSortedArrays {
    /* 
    public static int[] intersectionArray(int[] nums1, int[] nums2) {
        int[] nums1= {1, 1, 1,2};
        int[] nums2 = {1,2,2};
        //Case when nums1 = {1, 1, 1, 2} and nums2 = {1, 2, 2}—your output will still not handle the exact number of duplicates correctly.

        Set<Integer> hs = new TreeSet<>(); //Problem with hashSet is no repeated element will be included
        ArrayList<Integer> arr = new ArrayList<>(); //ArrayList to store the common elements
        for(int i:nums1){
            hs.add(i);
        }
        System.out.println(hs);
        
        for(int i:nums2){
            if(hs.contains(i)){
                arr.add(i);
                      
            }
        }
        
        int j=0;
        int[] result = new int[arr.size()]; //array to store the common elements
        for(int i:arr){
            result[j] = i;
            j++;
        }
        return result;
    }
       */
      public static int[] intersectionArray(int[] nums1, int[] nums2){
        List<Integer>arr = new ArrayList<>();
        int i=0, j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i] == nums2[j]){
                arr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else{
                j++;
            }
        }

            int[] result = new int[arr.size()];
            int k = 0;
            for(int num: arr){
                result[k] = num;
                k++;
            
        }
        return result;
      }



    public static void main(String[] args) {
         int[] nums1= {1, 1, 1,2};
        int[] nums2 = {1,2,2};
        for(int num: intersectionArray(nums1, nums2)){
            System.out.print(num + " ");
        }
    }
}
