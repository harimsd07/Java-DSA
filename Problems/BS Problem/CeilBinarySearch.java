class CeilBinarySearch{
    public static void main(String arggs[]){
        int arr[] = {1,5,7,10,25,30,45,60};
        int target = 60;

        int result = CeilingValue(arr, target);

        System.out.println(result);

    }

    // ceiling is concept of finding the number that is smallest larger number that is greater than target

    static int CeilingValue(int arr[],int target){
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);

        if(target > end){
            return -1;
        }
         
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
        return start;
    }
}