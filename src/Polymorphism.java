class A2{
    public void show(){
        System.out.println("In a");
    }
}
class B2 extends A2{
    public void show(){
        System.out.println("In b");
    }
}
class C2 extends A2{
    public void show(){
        System.out.println("In c");
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        A2 obj=new A2();
        obj.show();
        obj=new B2();
        obj.show();
        obj=new C2();
        obj.show();

    }
}
