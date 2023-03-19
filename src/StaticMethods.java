class Phone1{
    int price;
    String Model;
    static String name;

    static
    {
        name="Phone";
        System.out.println("In Static Block");
    }
    public Phone1(){
        Model="";
        price= 2000;
        System.out.println("In Constructor");
    }
    public void show(){
        System.out.println(Model + ":" + price + ":" + name);
    }
    public  static void show1(Phone1 p){
        System.out.println(p.Model + ":" + p.price + ":" + name);
    }
}

public class StaticMethods {
    public static void main(String[] args) {
        Phone1 p = new Phone1();
        p.Model="Samsung";
        p.price= 300000;
        Phone1.name="Smartphone";
        p.show();
        Phone1 p1 = new Phone1();
        p1.Model="Samsung Galaxy";
        p1.price= 400000;
        Phone1.name="Smartphone";
        Phone1.show1(p1);

    }
}
