// LeetCode Problem 852 and 162

class BitonicArray{
    public static void main(String[] args){
        int arr[] = {2,3,5,7,8,2,1};
        System.out.println(mountainArray(arr));

    }
    public static int mountainArray(int arr[]){
        int start = 0;
        int end = arr.length-1;

        while(start <  end){
            int mid = start + (end- start)/2;
             
            if(arr[mid]  >arr[mid+1]){
                end = mid;
            }else{
                start = mid +1;
            }
        }
        return end;  // here we can also start,since both start and end gives same value
    }
}