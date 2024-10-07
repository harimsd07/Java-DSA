import java.util.*;
public class QuickSort {

    public static void quickSort(int arr[],int low,int high){
        if(low<high){
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int arr[],int low,int high){
        int pivot = arr[high];
        int i = low - 1;

        for(int j=0;j<high;j++ ){
            if(arr[j] < pivot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            
        }
                int temp = arr[i+1];
                arr[i+1] = arr[high];
                arr[high] = temp;

        return i+1;

    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size of the array");

        int n =scan.nextInt();
        int arr[] = new int[n];
        int size = arr.length;
       

        for(int i=0;i<size;i++){
            arr[i] =scan.nextInt();
        }
        System.out.println("Array before sorting:");
        for(int num:arr){
            System.out.print(num + " ");
        }
        quickSort(arr,0,size-1);
        
        System.out.println("Array after sorting:");
        for(int num:arr){
            System.out.print(num + " ");
        }

    }
}
