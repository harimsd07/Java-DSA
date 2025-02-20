package Recursion;

public class fibonacciRecur {
    public static void main(String args[]){
        int result = fibonacci(7);
        System.out.println(result);
    }

    static int fibonacci(int n){
        if(n<2){
            return n;       
        }
        int fibValue = fibonacci(n-1) +fibonacci(n-2);
        return fibValue;
    }
}
