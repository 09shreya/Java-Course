class Phone{
        int price;
        String Model;
        static String name;

        static
        {
        name="Phone";
        System.out.println("In Static Block");
        }
        public Phone(){
            Model="";
            price= 2000;
            System.out.println("In Constructor");
        }
    public void show(){
        System.out.println(Model + ":" + price + ":" + name);
    }
}


public class StaticBlock {
    public static void main(String[] args) {
        Phone p = new Phone();
        p.Model="Samsung";
        p.price= 300000;
        Phone.name="Smartphone";
        p.show();

    }
}
