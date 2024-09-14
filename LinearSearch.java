import java.util.*;
class LinearSearch{
    public static int linearSearch(int arr[],int n, int s){
        for(int i =0;i<arr.length;i++){
            if(arr[i] == s){
                return i;
            }
        }
        return -1;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];

        for(int i=0;i<arr.length;i++){
            arr[i] = scan.nextInt();
        }
        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
            
        }
        System.out.println(" ");
        System.out.println("Enter the element to be searched");
        int s = scan.nextInt();

        int result = linearSearch(arr,n,s);

        if(result == -1){
            System.out.println("Element not found");
        }else{
            System.out.println("Element found at index:" +result );
        }
    }
}