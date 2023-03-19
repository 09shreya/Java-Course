class Human1{
    private int age;
    private String name;
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age=a;
    }
    public String getName(){
        return name;

    }
    public void setName(String n)
    {
        name=n;
    }

}

public class Encapsulation {
    public static void main(String[] args) {
        Human1 h=new Human1();
        h.setAge(23);
        h.setName("Shreya");
        System.out.println(h.getAge());
        System.out.println(h.getName());

    }
}
