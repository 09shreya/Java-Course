import java.util.*;

public class Set1 {
    public static void main(String[] args) {
        Set<Integer> nums=new HashSet<Integer>();
        nums.add(62);
        nums.add(53);
        nums.add(81);
        nums.add(98);
        for(int l:nums)
            System.out.println(l);

        Collection<Integer> num=new TreeSet<Integer>();
        num.add(6);
        num.add(5);
        num.add(8);
        num.add(9);
        for(int m:num)
            System.out.println(m);

    }
}
