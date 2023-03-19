class Addition{
    public int add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1,int n2,int n3){
        return n1+n2+n3;
    }
    public double add(double n1,int n2){
        return n1+n2;
    }
    public float add(float n1,int n2){
        return n1+n2;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Addition object =new Addition();
        System.out.println(object.add(4,3));
        System.out.println(object.add(3.6,8));
        System.out.println(object.add(4546,89));
        System.out.println(object.add(5,6,8));

    }
}
