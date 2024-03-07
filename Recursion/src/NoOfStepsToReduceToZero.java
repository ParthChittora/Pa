public class NoOfStepsToReduceToZero {
    public static int count(int num,int ct){
        if(num==0)
            return ct;
        if(num%2==0)
            return count(num/2,ct+1);
        else return count(num-1,ct+1);
    }
    public static int numberOfSteps(int num) {
        return count(num,0);
    }

    public static void main(String[] args) {
        System.out.println(numberOfSteps(14));
    }
}
