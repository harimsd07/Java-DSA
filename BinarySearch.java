import java.util.*;
class BinarySearch{
    public static int binarySearch(int arr[],int target,int first,int last){
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
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        for(int i =0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Elements in array before sorting:");

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println("");

        System.out.println("Elements in array after sorting:");

        Arrays.sort(arr);

        for(int i =0; i<arr.length;i++){
            System.out.print(arr[i]+ " "); 
        }
        System.out.println("");

        System.out.println("Enter the element to be searched");
        int s = scan.nextInt();
        int first = arr[0];
        int last = arr.length-1;
        int result = binarySearch(arr,s,first,last);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:" +result );
        }
    }
   
}