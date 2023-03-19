import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<Integer> nums=new ArrayList<Integer>();
        nums.add(6);
        nums.add(5);
        nums.add(8);
        nums.add(9);
        nums.add(6);
        System.out.println(nums.indexOf(6));
        for(int l:nums){
            System.out.println(l*2);
        }
    }
}
