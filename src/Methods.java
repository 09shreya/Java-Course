class Activities {
    public void playMusic() {
        System.out.println("Music Playing...");
    }

    public String GetMeAPen(int cost) {
        if (cost >= 13) {
            return ("Pen");
        } else
            return ("Nothing");
    }
}
public class Methods {
    public static void main(String[] args) {
        Activities ob = new Activities();
        ob.playMusic();
        String str= ob.GetMeAPen(10);
        System.out.println(str);
    }

    }

