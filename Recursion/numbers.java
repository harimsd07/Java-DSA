class numbers {
public static void main(String argss[]){
       printNum1(5);
       
}
    static void printNum(int n){
        
        if(n==0)
        {
            return;
        }

        System.out.println(n);
    
        printNum(n-1);
        
    }


    static void printNum1(int n){
        
        if(n==0)
        {
            return;
        }

        printNum1(n-1);
        System.out.println(n);
    
        
    }
    
}
