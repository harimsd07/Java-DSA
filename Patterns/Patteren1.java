public class Patteren1 {
    public static void Pattern1(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        /* 
            * 
            * * 
            * * *  
            * * * *  
         */  
        
    }
    public static void Pattern2(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=n;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        /*  * * * * 
            * * * * 
            * * * * 
            * * * *  
         */  
    }

    public static void Pattern3(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=n-row+1;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        /*  * * * * 
            * * * 
            * *  
            *   
         */  
    }

    public static void Pattern4(int n){
        for (int row =1;row<=n;row++){
            for(int col=1;col<=row;col++){
                System.out.print( col +" ");
            }
            System.out.println();
        }   
        /*
            1 
            1 2 
            1 2 3 
            1 2 3 4 
            1 2 3 4 5 
         */  
    }

    public static void Pattern5(int n){
        for (int row =1;row<2*n;row++){
            int totalColinRow = row>n ? 2*n-row:row;
            for(int col=1;col<=totalColinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        /* 
            * 
            * * 
            * * * 
            * * * * 
            * * * * * 
            * * * * 
            * * * 
            * * 
            * 
        */  
    }
   
    public static void Pattern6(int n){
        for (int row =1;row<2*n;row++){
            int totalColinRow = row>n ? 2*n-row:row;

            int noOfSpaces = n-totalColinRow;
            for(int gap=0;gap<noOfSpaces;gap++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalColinRow;col++){
                System.out.print("* ");
            }
            System.out.println();
        }   
        /* 
                  * 
                 * * 
                * * * 
               * * * * 
              * * * * * 
               * * * * 
                * * * 
                 * * 
                  * 
        */  
    }

    public static void Pattern7(int n){
        for (int row =1;row<2*n;row++){
            int totalColinRow = row>n ? 2*n-row:row;

            int noOfSpaces = n-totalColinRow;
            for(int gap=0;gap<noOfSpaces;gap++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalColinRow;col++){
                System.out.print( col+ " ");
            }
            System.out.println();
        }   
        /* 
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
 1 2 3 4 
  1 2 3 
   1 2 
    1
        */  
    }

    public static void Pattern8(int n){
        for (int row =1;row<n;row++){
            int noOfSpaces = n-row;
            for(int gap=0;gap<noOfSpaces;gap++){
                System.out.print("  ");
            }
            for(int col=row;col>=1;col--){
                System.out.print( col+ " ");
                
            }
            for( int col=2;col<=row;col++){
                System.out.print( col+ " ");
            }
            
            System.out.println();
        }   
        /* 
        1 
      2 1 2 
    3 2 1 2 3 
  4 3 2 1 2 3 4 
        */  
    }

    public static void Pattern9(int n){
        for (int row =1;row<=n;row++){
            int totalColinRow = row;

            int noOfSpaces = n-totalColinRow;
            for(int gap=0;gap<noOfSpaces;gap++){
                System.out.print(" ");
            }
            for(int col=1;col<=totalColinRow;col++){
                System.out.print( col+ " ");
            }
            System.out.println();
        }   
        /* 
    1 
   1 2 
  1 2 3 
 1 2 3 4 
1 2 3 4 5 
        */  
    }

    public static void Pattern10(int n){
        for(int row=1;row<=n;row++){
            int totalColinRow = n-row+1;

            int space =row-1;
            for(int s=0;s<space;s++){
                System.out.print(" ");
            }

         for(int col=totalColinRow;col>=1;col--){
            System.out.print(col+" ");
         }
         System.out.println("");
        }

        /*
         5 4 3 2 1 
          4 3 2 1 
           3 2 1 
            2 1 
             1 
         */
    }

    public static void main(String args[]){
        Pattern10(5);
    }
}
