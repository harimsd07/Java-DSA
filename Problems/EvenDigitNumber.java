class EvenDigitNumber{
    public static void main(String args[]){
        int arr[] = {10,234,3456,12345,9876,1234};

        int totalEvenNumOfDigits= findNumbers(arr);

        System.out.println(totalEvenNumOfDigits);
    }
    
    static int findNumbers(int arr[]){
        int initialCount =0;
        for(int num:arr){
            if(even(num)){
                initialCount++;
            }
        }
        return initialCount;
    }

    static boolean even(int num){
        int numberOfDigits = digits(num);

        if(numberOfDigits%2 == 0){
            return true;
        }
        return false;
    }

    static int digits(int num){
        int initialCount =0;
        while(num>0){
            initialCount++;
            num = num/10;
        }
        return initialCount;
    }
   

}
