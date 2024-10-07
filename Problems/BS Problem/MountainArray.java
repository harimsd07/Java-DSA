// Leetcode problem 1095

class MountainArray{
    public static void main(String[] args){
        int arr[] = {2,3,5,7,8,2,1};     

    }
    static int search(int arr[],int target){
        int peak =peakValueInArray(arr);
        int firstHalf = OrderAgnosBS(arr, target, 0, peak);

        if(firstHalf != -1){
            return firstHalf;
        }
        return OrderAgnosBS(arr, target, peak+1, arr.length-1);



    }
    static int peakValueInArray(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]>arr[mid+1]){
                end = mid;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
    static int OrderAgnosBS(int arr[],int target,int start,int end){
        
        boolean isAscen = arr[start] <arr[end];

        while(start<end){
            int mid = start + (end-start)/2;
           
            if(arr[mid] == target){
                return mid;
            }
            if(isAscen){
                if(arr[mid]>target){
                    end = mid-1;
            }else{
                start = mid + 1;
            }
        }else{
            if(arr[mid] > target){
                start = mid +1;
            }else{
                end =mid -1;
            }
        }

        }
        return -1;
    }
 
}