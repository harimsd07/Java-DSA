class SearchRange{
    public static void main(String args[]){

        String str ="original" ;
        char target = 'o';

        boolean result = search(str,target,0,5);

        System.err.println(result);
        
    }
    static boolean search(String str,char target,int start,int end){
        if(str.length() == 0){
            return false;
        }
        for(int i =start;i<=end;i++){
            if(str.charAt(i) ==target){
                return true;
            }
        }
        // for(char ch:str.toCharArray()){
        //     if(ch = target){
        //         return true;
        //     }
        // }
        return false;
    }
}