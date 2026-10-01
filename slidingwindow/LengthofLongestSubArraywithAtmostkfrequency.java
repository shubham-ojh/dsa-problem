package slidingwindow;

import java.util.HashMap;

public class LengthofLongestSubArraywithAtmostkfrequency {
    public static void main(String[] args) {
       int []nums={1,2,1,2,3,3,1,2,3};
       int k=2;
        System.out.println(longestSunarray(nums,k));
    }
    static int longestSunarray(int []nums,int k){
        int n=nums.length;
        int start=0;
        int end=0;
        int maxLength=0;
        //create hashmap
        HashMap<Integer,Integer>freqMap=new HashMap<>();
        //put frequency in map
        while (end<n) {
           // include element in window
            freqMap.put(nums[end], freqMap.getOrDefault(nums[end],0)+1);
            //if windoe is invalid,then shrink it
            while (freqMap.get(nums[end])>k){
                freqMap.put(nums[start], freqMap.get(nums[start]-1));
                start++;
            }
            maxLength=Math.max(maxLength,end-start+1);
            end++;
        }
        return maxLength;
    }
}
