class OrderAgnosticBS{
    public static void  main(String args[]){
        int arr[] = {10,13,17,20,50,99};
        int target = 50;
        int ans = OrderAgnosBS(arr, target);
        System.out.println(ans);

    }

    static int OrderAgnosBS(int arr[],int target){
        int s =0;
        int l = arr.length-1;
        boolean isAscen = arr[s] <arr[l];

        while(s<l){
            int mid = s + (l-s)/2;
           
            if(arr[mid] == target){
                return mid;
            }
            if(isAscen){
                if(arr[mid]>target){
                l = mid-1;
            }else{
                s = mid + 1;
            }
        }else{
            if(arr[mid] > target){
                s = mid +1;
            }else{
                l =mid -1;
            }
        }

        }
        return -1;
    }
   
}