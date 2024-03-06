public class FirstUpperCaseLetterRecursion {
//    https://www.geeksforgeeks.org/first-uppercase-letter-in-a-string-iterative-and-recursive/
//    Input : geeksforgeeKs
//    Output : K
//
//    Input  : geekS
//    Output : S
    public static char findCapitalLetter(String str, int i){
        if(str.charAt(i)=='\0')
            return 0;
        if(Character.isUpperCase(str.charAt(i))){
            return str.charAt(i);
        }
        return findCapitalLetter(str,i+1);
    }

    public static void main(String[] args) {
        String ip = "hiitsParth";
        System.out.println(findCapitalLetter(ip,0));
    }
}

