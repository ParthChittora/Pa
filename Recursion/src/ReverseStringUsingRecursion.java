import java.util.Arrays;

public class ReverseStringUsingRecursion {
    public static void reverseString(char[] s) {
        helper(s,0);
    }
    public static void helper(char[] s , int st){
        if(st>=s.length/2)
            return;
        char temp =  s[s.length-st-1];
        s[s.length-st-1]=s[st];
        s[st]=temp;
        helper(s,st+1);
    }

    public static void main(String[] args) {
        char[] ip ={'h','e','l','o'};reverseString(ip);
        System.out.println(Arrays.toString(ip));
    }
}
