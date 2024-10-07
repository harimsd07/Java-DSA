class RotatedBinarySearch{
    public static void main(String args[]){
      int arr[] = {3,4,5,6,1,2};
      int target = 2;
      System.out.println(search(arr,target));
    }
    public static  int search(int[] nums, int target) {
      int pivot = findPivot(nums);
    //    here pivot != -1 refers that it is not rotated sorted array, hence we are doing normal binary search
      if(pivot == -1 ){
        return BinarySearch(nums, target,0, nums.length-1);
      }

      if (nums[pivot] == target) {
        return pivot;
    }
    //  here we will get two parts of array.
    // if the target value is greater than the start index.
    
    if (target >= nums[0]) {
        return BinarySearch(nums, target, 0, pivot - 1);
    }

    return BinarySearch(nums, target, pivot + 1, nums.length - 1);
      
    }

    static int BinarySearch(int arr[],int target,int start,int end){
        
        while(start<=end){
            int mid = start + (end-start)/2;

            if(target < arr[mid]){
                end = mid -1;
            }else if(target > arr[mid]){
                start = mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }


     static int findPivot(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end -start)/2;
            // to check if the the pivot is in the middle
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            // here we are checking if the pivot is in the previous element before  middle 
            if(mid > start &&arr[mid] < arr[mid-1]){
                return mid-1;
            }
            // here we are checking for the pivot in the first half the array which is if middle is less than start means the 
            // elements next to the middle(second half of the array) also less than start hence we are searching before the middle 
            // element in the given array  
            if(arr[mid] <= arr[start]){
                end = mid-1;

            }
            // here if the start is less than or equal to mid means the the elements present before the mid in the array must be 
            // less than the mid element hence we are searching for the pivot in the second half
            else{
                start = mid +1;
            }
        }
        return -1;
     }
    //  if the array of element consist of duplicate element
     static int findPivotWithDuplicateElement(int arr[]){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = start + (end -start)/2;
            if(mid < end && arr[mid] > arr[mid+1]){
                return mid;
            }
            if(mid > start &&arr[mid] < arr[mid-1]){
                return mid-1;
            }
        //    wether in the given arrray the elements in the start, mid and end are equal means, just ignore the duplicates
            if(arr[mid] == arr[start] || (arr[start] == arr[end] && (arr[mid] == arr[end]))){

                //  what if the arr[start] may be the pivot element, we need to check for the possibility
                if(arr[start] > arr[start+1]){
                    return start;
                }
                start ++;

                //  if the pivot is at the end means
                if(arr[end] <arr[end-1]){
                    return end -1 ;
                }
                end --;
            }
        }
        return -1;
     }
}