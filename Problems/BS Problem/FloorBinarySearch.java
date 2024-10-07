// Finding the floor for the given target in the array
class FloorBinarySearch{
    
    public static void main(String arggs[]){
        int arr[] = {1,5,7,10,25,30,45,60};
        int target = 4;

        int result = FloorValue(arr, target);

        System.out.println(result);

    }

// floor is the concept of finding the value of the largest smaller number that is less than target
    static int FloorValue(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);

        
         
        while(start <= end){
            int mid = start + (end-start)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else if(arr[mid] < target){
                start = mid+1;
            }
        }
        return end;
    }
}