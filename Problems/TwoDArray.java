import java.util.*;
class TwoDArray{
    public static void main(String args[]){
        int arr[][] = {
            {10,12,23,65},
            {11,12,35},
            {145,76}
        };

        int target = 2;

       int[] ans = search(arr,target);

        System.out.println(Arrays.toString(ans));
    }

    static int[] search(int arr[][],int target ){
        for(int i =0; i<arr.length;i++) { // i is row here 
              for(int j=0;j<arr[i].length;j++){ // jis the column here
                    if(arr[i][j] == target){
                        return new int[]{i,j} ;
                    }
              }    
        }
        return new int[]{-1,-1};
    }
}