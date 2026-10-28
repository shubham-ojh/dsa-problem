package Faangcompany.array;

public class Nextpermutation {
    public static void main(String[] args) {

    }
    static void nextPermutaion(int []arr){
        int i=arr.length;
        while (i>=0 && arr[i+1]<=arr[i]){
            i--;
        }

        if (i>=0) {
            int j = arr.length - 1;

            while(arr[j]<=arr[i]){
                j--;
            }
            swap(arr,i,j);
        }

        revesr(arr,i+1);
    }

    static  void  swap(int[]arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static  void  revesr(int[]nums,int i){
        int j= nums.length-1;
        while (i<j){
            swap(nums,i,j);
            i++;
            j--;

        }



    }

}
