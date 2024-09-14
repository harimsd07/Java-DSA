import java.util.Scanner;

class InsertionSort{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        int size = arr.length;
        for(int i =0;i<size;i++){
            arr[i] = scan.nextInt();
        }

            System.out.println("Element before sorting: ");

            for(int num:arr){
                System.out.print(num + " ");
            }

        for(int i =1; i<size;i++){
            int key = arr[i];
            int j = i-1;

            while(j>= 0  && arr[j] > key){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        System.out.println("Element after sorting: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
}