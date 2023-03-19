public class IfElseif {
    public static void main(String args[]){
        int a=5;
        int b=9;
        int c=6;
        if(a>b && a>c)
            System.out.println(a);
        else if(b>c)
            System.out.println(b);
        else
            System.out.println(c);
    }
}
