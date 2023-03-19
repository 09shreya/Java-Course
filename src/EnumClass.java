enum Laptop1{
    MacBook(2000), Surface, XPS(3500), Thinkpad(3400);
    private int price;

    private Laptop1() {
        price = 500;
    }

    private Laptop1(int price) {
        this.price = price;
        System.out.println("in Laptop" + ":" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

public class EnumClass {
    public static void main(String[] args) {
        Laptop1[] l=Laptop1.values();
        for (Laptop1 lap : l) {
            System.out.println(lap+":"+ lap.getPrice());

        }
    }


}
