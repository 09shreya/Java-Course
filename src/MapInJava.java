import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class MapInJava{
    public static void main(String[] args) {
        Map<String,Integer> Students=new HashMap<>();
        Students.put("Shreya",98);
        Students.put("Shiv",78);
        Students.put("Sanya",88);
        Students.put("Jaya",58);
        Students.put("Priya",68);
        Students.put("Sarita",78);
        System.out.println(Students.values());
        for(String s:Students.keySet()){
            System.out.println(s +":" + Students.get(s));
        }


    }
}
