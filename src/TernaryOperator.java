public class TernaryOperator {
    public static void main(String[] args) {
        int num=4;
        int res=0;
        int res1=0;
        System.out.println("Implementation using if else statement");
        if(num%2==0)
            res=10;
        else
            res=20;
        System.out.println(res);
        System.out.println("Implementation using ternary operator");
        res1 = num%2==0? 10:20;
        System.out.println(res1);
    }
}
