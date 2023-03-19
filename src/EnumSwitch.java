enum Fruits{
    Apple,Banana,Orange,Mango,Cherry,Dates
}
public class EnumSwitch {
    public static void main(String[] args) {
        Fruits f=Fruits.Mango;
        switch (f){
            case Apple :
                System.out.println("Healthy fruit");
                break;
            case Banana:
                System.out.println("Favourite food");
                break;
            case Dates:
                System.out.println("Good for Blood ");
                break;
            case Mango:
                System.out.println("KIng oF fruits");
                break;
            case Cherry:
                System.out.println("Red in Colour");
                break;
            default:
                System.out.println("Orange in Colour");
        }
    }
}
