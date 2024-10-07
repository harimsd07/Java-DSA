class MinValue{
    public static void main(String args[]){
        int arr[] = {3,7,-11,12,78,56,17};

        int minVal = minVal(arr);

        System.out.println(minVal);

    }

    static int minVal(int arr[]){
        int result = arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i] <result){
                result = arr[i];
            }  
        }
        return result;
}
}