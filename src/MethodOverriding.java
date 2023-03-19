
class C{
    public int add(int n1,int n2){
        return n1+n2;
    }
}
class D extends C{
    public int add(int n1,int n2) {
        return n1 + n2+1;
    }

}
public class MethodOverriding{
    public static void main(String[] args) {
        C c=new C();
        D d=new D();
        int r1=c.add(3,4);
        int r2=d.add(5,6);
        System.out.println(r1);
        System.out.println(r2);
    }
}