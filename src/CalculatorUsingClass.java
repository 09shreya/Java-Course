class ArithmeticCalculator{
    public int add(int n1,int n2){
        int r=n1+n2;
        return r;
    }
    public int sub(int l1,int l2){
        int r1=l1-l2;
        return r1;
    }
    public int mul(int k1,int k2){
        int r2=k1*k2;
        return r2;
    }
    public int div(int o1,int o2){
        int r3=o1/o2;
        return r3;
    }

}
public class CalculatorUsingClass {
    public static void main(String[] args) {
        ArithmeticCalculator obj = new ArithmeticCalculator();
        System.out.println("The Sum is" + obj.add(34,5));
        System.out.println("The Subtraction is" + obj.sub(30,12));
        System.out.println("The Multiplication is" + obj.mul(45,17));
        System.out.println("The Division is" + obj.div(67,5));

    }
}
