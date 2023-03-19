class Ann1{
    public void showMeMethodOfThisClass(){
        System.out.println("In first method");
    }
class Ann2 extends Ann1{
        @Override
    public void showMeMethodOfThisClass(){
            System.out.println("In Second method");
        }
}

}
public class Annotations {
    public static void main(String[] args) {
        Ann1 ob= new Ann1();
        ob.showMeMethodOfThisClass();

    }
}
