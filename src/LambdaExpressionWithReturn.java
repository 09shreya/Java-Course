@java.lang.FunctionalInterface
interface Le{
    int add(int i,int j);

}
public class LambdaExpressionWithReturn {
    public static void main(String[] args) {
        Le ob= (i,j) -> i+j;
        int result=ob.add(5,8);
        System.out.println(result);

    }
}
