class calc{
    public int add(int a,int b)
    {
     return a+b;
    }
    public int sub(int a,int b)
    {
        return a-b;
    }
}
class AdvCalc extends calc{
    public int mul(int a,int b)
    {
        return a*b;
    }
    public int div(int a,int b)
    {
        return a/b;
    }
}

public class Inheritance {
    public static void main(String[] args) {
        AdvCalc ac=new AdvCalc();
        int r1= ac.add(3,4);
        int r2= ac.sub(6,4);
        int r3= ac.mul(12,4);
        int r4= ac.div(23,4);
        System.out.println(r1);
        System.out.println(r2);
        System.out.println(r3);
        System.out.println(r4);

    }
}
