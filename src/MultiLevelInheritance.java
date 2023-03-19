class calc1{
    public int add(int a,int b)
    {
        return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}
class AdvCalc1 extends calc{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}
class VeryAdvCalc extends AdvCalc1{
    public double pow(int a,int b){
        return Math.pow(a,b);
    }
}
public class MultiLevelInheritance {
    public static void main(String[] args) {
        VeryAdvCalc vac =new VeryAdvCalc();
        double r5=vac.pow(2,4);
        System.out.println(r5);
        int r6= vac.div(4,2);
        System.out.println(r6);
    }
}
