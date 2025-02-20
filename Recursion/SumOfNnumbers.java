class SumOfNnumbers {
public static void main(String[] args) {
int result = SumOfNnumbers(10);
System.out.println(result);

}

static int SumOfNnumbers(int n){
    if(n<=1){
        return 1;
    }
    return n + SumOfNnumbers(n-1);
}
}

