// Finding the position of the element in the infinite array.
class InfiniteArray{
    public static  void main(String[] args){
        int arr[] = {2,3,7,9,13,15,17,20,27,30,35,36,39,40};
        int target = 39;
        System.out.println(value(arr,target));

    }
    public static int value(int arr[],int target){
        int start =0;
        int last =1;
        
        while(target>arr[last]){
            int newStart = last +1;
            // to find the next end, we are adding last index with the sizeof the box with 2
            last = last +  (last-start+1)*2; 
            start = newStart;
        }
        return binarySearch(arr,target,start,last);
    }
    public static  int binarySearch(int arr[],int target,int first,int last){
        while(first<=last){
            int mid = first + (last-first)/2;

            if(arr[mid] == target){
                return mid;
            }
            else if(mid > target){
                return binarySearch(arr, target, first, mid-1);
            }
            else if(mid<target){
                return binarySearch(arr, target, mid+1, last);
            }
        }
        return -1;
    }
}