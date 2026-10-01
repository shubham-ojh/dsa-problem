package slidingwindow;

public class Containerwithmostwater {
    public static void main(String[] args) {
        int []arr={1,8,5,4,3,2,6,7,7 };
        System.out.println(mostWater(arr));
    }
    static  int mostWater(int[]height){
        int n=height.length;
        int i=0;
        int j=height.length-1;
        int ans=0;
        while (i<j){
            ans=Math.max(ans,(j-1)*Math.min(height[i], height[j]));
            //if height less in start increse its index
            if (height[i]<=height[j]){
                i++;
//otherwise decrese right index
            }else {
                j--;
            }

        }
        return  ans;
    }
}
