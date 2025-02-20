class ProductOfDigits {
  public static void main(String[] args) {
      int result = ProductOfDigits(345);
      System.out.println(result);
}

static int ProductOfDigits(int n){
    if(n%10==n){
    return n;
    }
    return (n%10) * ProductOfDigits(n/10);
}
}
