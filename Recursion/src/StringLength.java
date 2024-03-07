public class StringLength {
    public static int len(String str){
        if(str.equals("")){
            return 0;
        }
        return 1+len(str.substring(1));
    }

    public static void main(String[] args) {
        String a = "Parth Chittora";
        System.out.println(len(a));
    }
}
