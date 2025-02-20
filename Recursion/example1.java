package Recursion;

public class example1 {
    public static void main(String args[]){
        print(1);

    }

    static void print(int n){
        if(n==5){
            System.out.println("Hello world 5");
            return;
        }
        System.out.println("Hello World " + n);
        print(n+1);
    }
}
