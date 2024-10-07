import java.util.*;
class MergeSort{
    private static int[] merge;

    public static void main(String args[]){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the size the of the array:");

        int n = scan.nextInt();

        int arr[] = new int[n];

        int size = arr.length;

        for(int i =0; i<size;i++){
            arr[i] = scan.nextInt();
        }

        System.out.println("Array before sorted:");

        for(int num:arr){
            System.err.print(num + " ");
        }

        System.err.println("");

        arr = mergeSort(arr);


        System.out.println("Array after sorted:");

        for(int num:arr){
            System.err.print(num + " ");
        }

        System.err.println("");




      
    }
     static int[] mergeSort(int[] arr){
        if(arr.length == 1){
        return arr;
        }
       
        int mid = arr.length/2;

        int[] left  = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

       return merge(left,right);
    }

    private static int[] merge(int[] first, int[] second) {
        int[] mix = new int[first.length+second.length]; 

        int i =0;
        int j =0;
        int k =0;

        while( i < first.length &&  j< second.length){
            if(first[i]<second[j]){
                mix[k] = first[i];
                i++;
            }else{
                mix[k] = second[j];
                j++;
            }
            k++;
        }

        while(i <first.length){
            mix[k] = first[i];
            i++;
            k++;
        }

        while(j< second.length){
            mix[k] = second[j];
            j++;
            k++;
        }
        return mix;
    }
    
}