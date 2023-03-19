class x{
    public x(){
        System.out.println("Inside a constructor");
    }
    public void show(){
        System.out.println("An Anonymous Object");
    }
}
public class AnonymousObject {
    public static void main(String[] args) {
        new x();
        new x().show();
    }
}
