interface Computer{
    void code();
}
class Desktop implements Computer{
    public void code(){
        System.out.println("code faster");
    }
}
class Laptop implements Computer{
    public void code(){
        System.out.println("code");
    }
}
class Developer{
    public void devApp(Computer lap){
        lap.code();
    }
}
public class NeedOfInterface {
    public static void main(String[] args) {
        Computer desk=new Desktop();
        Computer lap=new Laptop();
        Developer dev=new Developer();
        dev.devApp(lap);
        dev.devApp(desk);
    }
}
