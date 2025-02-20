class FactorialOfNumber {

    public static void main(String args[]){
        int result = factorial(10);
        System.out.println(result);
    }

    static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
}
