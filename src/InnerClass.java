class A3{
    public void show()
    {
        System.out.println("In Outer Class");
    }
    class B3{
        public void show(){
            System.out.println("In Inner Class");
        }
    }

}

public class InnerClass {
    public static void main(String[] args) {
        A3 obj=new A3();
        obj.show();
        A3.B3 obj1=obj.new B3();
        obj1.show();

    }

}
