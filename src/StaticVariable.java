class Mobile{
    String model;
    int price;
    static String name;
    public void show(){
        System.out.println(model + ":" + price + ":" + name);

    }

}
public class StaticVariable {
    public static void main(String[] args) {
        Mobile m =new Mobile();
        m.model="Samsung";
        m.price= 20000;
        Mobile.name="Phone";

        Mobile m2 =new Mobile();
        m2.model="Apple";
        m2.price= 60000;
        Mobile.name="Phone";

        Mobile m3 =new Mobile();
        m3.model="Redmi";
        m3.price= 10000;
        Mobile.name="Phone";

        m.name="Smartphone";
        m.show();
        m2.show();
        m3.show();


    }
}
