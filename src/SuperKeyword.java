class A {
    public A() {
        super();
        System.out.println("In A");
    }

    public A(int n) {
        super();
        System.out.println("In A int");
    }

    public void show() {
    }
}
    class B extends A{
        public B(){
            super();
            System.out.println("In B");
        }
        public B(int n){
            this();
            System.out.println("In B int");
        }

    }
public class SuperKeyword {
    public static void main(String[] args) {
        A a=new A(5);
        B b=new B(6);


    }
}
