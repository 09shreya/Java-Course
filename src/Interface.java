interface P{
    int area= 23;
    String fig="Rectangle";
    void show();
    void config();
}
interface O{
    void run();
    void eat();
}
interface Q extends O{

}
class S implements P,Q
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run(){
        System.out.println("Run");
    }
    public void eat()
    {
        System.out.println("Eat");
    }

}
public class Interface {
    public static void main(String[] args) {
        P obj= new S();
        obj.show();
        obj.config();
        O ob=new S();
        ob.eat();
        ob.run();
        System.out.println(P.area);
        System.out.println(P.fig);


    }

}
