package slidingwindow;

public class ContainerwithMostWaterrevision {

    public static void main(String[] args) {
        int []height={2,5,7,8,3,2,8};
        System.out.println(mostwater(height));

    }
    static int mostwater(int[]height){
        int l=0;
        int r= height.length-1;
        int max=0;
        while(l<r){
            int width=r-l;
            int h=Math.min(height[l],height[r]);
             max= Math.max(max,h*width);
             if (height[l]>height[r]){
                 r--;

             }
             else{
                 l++;
             }
        }
        return max;
    }

}
