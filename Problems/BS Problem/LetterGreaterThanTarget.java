// Problem No:744
// Finding the smallest element greater than target
class LetterGreaterThanTarget{
    public static void main(String args[]){
        char arr[] = {'c','d','j','m'};
        char target = 'a';

        char result = letterNextToTarget(arr,target);

        System.out.println(result);

    }

    static char letterNextToTarget(char arr[],char target){
        int start =0;
        int end = arr.length-1;

        while(start<=end){
            int mid = start + (end - start)/2;

            if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return arr[start % arr.length];
    }
}