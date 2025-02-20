class SumOfDigits {

    public static void main(String args[]){
        int result = SumOfDigits(55);
        System.out.println(result);

    }

    static int SumOfDigits(int n){
        if(n==0){
            return 0;
        }
        
        return SumOfDigits(n/10)+ (n%10) ;
    }
}
