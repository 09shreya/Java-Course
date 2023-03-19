class People{
    private int age;
    private String name;
    public People(){
        int age=23;
        String name= "Shreya";
        System.out.println("Inside Default Constructors");
    }
    public People(int age,String name){
        this.age= age;
        this.name=name;
        System.out.println("Inside Parametrized Constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructor {
    public static void main(String[] args) {
        People ph=new People(23,"Shalini");
        People ph1=new People();
        System.out.println(ph.getAge() +":"+ ph.getName());
        ph1.setAge(25);
        ph1.setName("Sneha");
        System.out.println(ph1.getAge() +":"+ ph1.getName());


    }
}
