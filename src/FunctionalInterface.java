@java.lang.FunctionalInterface
interface In{
    void show();
}
class Inn implements In{
    public void show(){
        System.out.println("IN CLASS");
    }
}
public class FunctionalInterface {
    public static void main(String[] args) {                
        In obj=new In() {
            @Override
            public void show() {
                System.out.println("In Show");
            }
        } ;
        obj.show();
         obj=new Inn();
        obj.show();



        // With Lambda Expression

        In obj1= () -> System.out.println("In show");
        obj1.show();
    }
}
