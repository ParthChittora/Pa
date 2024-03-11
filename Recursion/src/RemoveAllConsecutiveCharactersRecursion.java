public class RemoveAllConsecutiveCharactersRecursion {
    public static String removeDup( String input){
        if(input.length()<=1){
            return input ;
        }
        if(input.charAt(0)==input.charAt(1)){
             return removeDup(input.substring(1));
        }
         return input.charAt(0)+removeDup(input.substring(1));
    }

    public static void main(String[] args) {
        String a = "aaaabbbbccc";
        System.out.println(removeDup(a));
    }
}
