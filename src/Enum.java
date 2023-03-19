enum Weeks{
    Monday,Tuesday,Wednesday,Thursday,Friday,Saturday,Sunday
}
public class Enum {
    public static void main(String [] args){
        Weeks w = Weeks.Friday;
        System.out.println(w);
        System.out.println(w.ordinal());
        Weeks[] ww =Weeks.values();
        for(Weeks s:ww){
            System.out.println(s+":"+ s.ordinal());
        }
    }
}
