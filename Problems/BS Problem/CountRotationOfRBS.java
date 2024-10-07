//  find the count of the rotation that the array get rotated
class CountRotationOfRBS{
    public static void main(String args[]){
        int arr[] = {4,5,6,1,2,3};
        System.err.println(countRotation(arr));
    }
    static int countRotation(int arr[]){
        int pivot = findPivot(arr);
        return pivot +1;
    }
//  used the find the pivot in the normal array without duplicate elements 
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