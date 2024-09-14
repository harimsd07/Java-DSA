import java.util.*;
class SelectionSort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];
        int size = arr.length;
        int temp =0;
        int minIndex = -1;
        

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        
        
        System.out.println("Element before sorting:");
        for(int num:arr){
            System.out.print(num +" ");
        }
        System.out.println();

            for(int i = 0;i<size-1;i++){
                minIndex = i;
                for(int j=i+1;j<size;j++){
                    if(arr[i] > arr[j]){
                        minIndex = j;
                    }
                    temp = arr[minIndex];
                    arr[minIndex] =arr[i];
                    arr[i] = temp;

                    System.out.println();

                    for(int num:arr){
                        System.out.print(num + " ");
                    }  
                }            
            }
       
        System.out.println("Element after sorting:");
        for(int num:arr){
            System.out.print(num +" ");
        }  
    }
}