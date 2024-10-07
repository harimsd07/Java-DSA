class MaxValArray{
    public static void main(String args[]){
        int arr[][] = {
            {10,14,81,71},
            {43,76,99},
            {101,776,10101}
        };
        int Maxvalue = maxValue(arr);

        System.out.println(Maxvalue);
    }

    static int maxValue(int arr[][]){
        int max = Integer.MIN_VALUE;    

        for(int[] i:arr){
            for(int j:i){
                if(j> max){
                    max = j;
                }
            }
        }
        return max;
    }
}

//  Alternative for enhanced for loop

// for(int i=0;i<arrr.length;i++){      i is row and j is column
//     for(int j=0;j<arr[i].length;j++){
//         if(arr[i][j] >max){
//             max = arr[i][j];
//         }
//     }
// }