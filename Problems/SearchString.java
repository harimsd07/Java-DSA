import java.util.*;
class SearchString{
    public static void main(String args[]){
        String str = "zebra";
        char target = 'z'  ;

        boolean result = search(str,target);

        System.out.print(Arrays.toString(str.toCharArray()));

        System.out.println();

        System.out.println(result);
    }

    static boolean search(String str,char target){
        if(str.length() == 0){
            return false;
        }
        for(int i =0;i<str.length();i++){
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