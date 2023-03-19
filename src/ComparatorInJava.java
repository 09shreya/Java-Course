import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInJava {
    public static void main(String[] args) {
        Comparator<Integer> com=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if(o1%10>o2%10) //to sort the elements in ascending order from one's place
                return 1;
                else
                    return -1;
            }
        };
        List<Integer> num =new ArrayList<Integer>();
        num.add(45);
        num.add(56);
        num.add(78);
        num.add(89);
        Collections.sort(num,com);
        System.out.println(num);

    }
}
