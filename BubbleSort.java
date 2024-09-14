import java.util.*;
class BubbleSort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the array size:");
        int n = scan.nextInt();

        int arr[] = new int[n];
        int size = arr.length;
        int temp =0;
        

        for(int i=0;i<size;i++){
            arr[i] = scan.nextInt();
        }
        
        
        System.out.println("Element before sorting:");
        for(int num:arr){
            System.out.print(num +" ");
        }
        System.out.println();

        for(int i=0;i<size;i++){
            for(int j=0; j<size-i-1;j++){
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] =arr[j+1];
                    arr[j+1] =temp;
                }
            }
            for(int num:arr){
                System.out.print(num +" ");
                
            }
            System.out.println();
        }
        System.out.println("Element after sorting:");
        for(int num:arr){
            System.out.print(num +" ");
        }  
    }
}